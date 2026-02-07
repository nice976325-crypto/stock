import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
// 导入路由配置
import routerConfig from '@/utils/routerConfig'

//1.创建组件
const components = {
  Index: () => import(routerConfig.components.Index),
  Home: () => import(routerConfig.components.Home),
  Board: () => import(routerConfig.components.Board),
  Login: () => import(routerConfig.components.Login),
  NotFound: () => import(routerConfig.components.NotFound),
  UpdatePassword: () => import(routerConfig.components.UpdatePassword),
  pay: () => import(routerConfig.components.pay),
  register: () => import(routerConfig.components.register),
  center: () => import(routerConfig.components.center),
  news: () => import(routerConfig.components.news),
  systemintro: () => import(routerConfig.components.systemintro),
  gupiaoleixing: () => import(routerConfig.components.gupiaoleixing),
  yonghu: () => import(routerConfig.components.yonghu),
  historyinfo: () => import(routerConfig.components.historyinfo),
  chat: () => import(routerConfig.components.chat),
  gupiaoxinxi: () => import(routerConfig.components.gupiaoxinxi),
  topten: () => import(routerConfig.components.topten),
  gupiaojiaoyi: () => import(routerConfig.components.gupiaojiaoyi),
  config: () => import(routerConfig.components.config),
  newstype: () => import(routerConfig.components.newstype)
};

//2.配置路由   注意：名字
export const routes = [{
    path: routerConfig.paths.home,
    name: '系统首页',
    component: components.Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: routerConfig.paths.home,
      name: '系统首页',
      component: components.Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: routerConfig.paths.updatePassword,
      name: '修改密码',
      component: components.UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: routerConfig.paths.pay,
      name: '支付',
      component: components.pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: routerConfig.paths.center,
      name: '个人信息',
      component: components.center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: routerConfig.paths.news,
        name: '股票资讯',
        component: components.news
      }
      ,{
	path: routerConfig.paths.systemintro,
        name: '系统简介',
        component: components.systemintro
      }
      ,{
	path: routerConfig.paths.gupiaoleixing,
        name: '股票类型',
        component: components.gupiaoleixing
      }
      ,{
	path: routerConfig.paths.yonghu,
        name: '用户',
        component: components.yonghu
      }
      ,{
	path: routerConfig.paths.historyinfo,
        name: '历史数据',
        component: components.historyinfo
      }
      ,{
	path: routerConfig.paths.chat,
        name: '在线客服',
        component: components.chat
      }
      ,{
	path: routerConfig.paths.gupiaoxinxi,
        name: '股票信息',
        component: components.gupiaoxinxi
      }
      ,{
	path: routerConfig.paths.topten,
        name: '十大成交股',
        component: components.topten
      }
      ,{
	path: routerConfig.paths.gupiaojiaoyi,
        name: '股票交易',
        component: components.gupiaojiaoyi
      }
      ,{
	path: routerConfig.paths.config,
        name: '轮播图管理',
        component: components.config
      }
      ,{
	path: routerConfig.paths.newstype,
        name: '股票资讯分类',
        component: components.newstype
      }
    ]
  },
  {
    path: routerConfig.paths.login,
    name: 'login',
    component: components.Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: routerConfig.paths.board,
    name: 'board',
    component: components.Board,
    meta: {icon:'', title:'board'}
  },
  {
    path: routerConfig.paths.register,
    name: 'register',
    component: components.register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: components.NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
