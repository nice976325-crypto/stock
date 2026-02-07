import VueRouter from 'vue-router'

// 导入路由配置
import routerConfig from '../config/routerConfig'

//引入组件
const components = {
  Index: () => import(routerConfig.components.Index),
  Home: () => import(routerConfig.components.Home),
  Login: () => import(routerConfig.components.Login),
  Register: () => import(routerConfig.components.Register),
  Center: () => import(routerConfig.components.Center),
  Storeup: () => import(routerConfig.components.Storeup),
  News: () => import(routerConfig.components.News),
  NewsDetail: () => import(routerConfig.components.NewsDetail),
  payList: () => import(routerConfig.components.payList),
  yonghuList: () => import(routerConfig.components.yonghuList),
  yonghuDetail: () => import(routerConfig.components.yonghuDetail),
  yonghuAdd: () => import(routerConfig.components.yonghuAdd),
  historyinfoList: () => import(routerConfig.components.historyinfoList),
  historyinfoDetail: () => import(routerConfig.components.historyinfoDetail),
  historyinfoAdd: () => import(routerConfig.components.historyinfoAdd),
  toptenList: () => import(routerConfig.components.toptenList),
  toptenDetail: () => import(routerConfig.components.toptenDetail),
  toptenAdd: () => import(routerConfig.components.toptenAdd),
  gupiaoxinxiList: () => import(routerConfig.components.gupiaoxinxiList),
  gupiaoxinxiDetail: () => import(routerConfig.components.gupiaoxinxiDetail),
  gupiaoxinxiAdd: () => import(routerConfig.components.gupiaoxinxiAdd),
  gupiaoleixingList: () => import(routerConfig.components.gupiaoleixingList),
  gupiaoleixingDetail: () => import(routerConfig.components.gupiaoleixingDetail),
  gupiaoleixingAdd: () => import(routerConfig.components.gupiaoleixingAdd),
  gupiaojiaoyiList: () => import(routerConfig.components.gupiaojiaoyiList),
  gupiaojiaoyiDetail: () => import(routerConfig.components.gupiaojiaoyiDetail),
  gupiaojiaoyiAdd: () => import(routerConfig.components.gupiaojiaoyiAdd),
  newstypeList: () => import(routerConfig.components.newstypeList),
  newstypeDetail: () => import(routerConfig.components.newstypeDetail),
  newstypeAdd: () => import(routerConfig.components.newstypeAdd),
  systemintroList: () => import(routerConfig.components.systemintroList),
  systemintroDetail: () => import(routerConfig.components.systemintroDetail),
  systemintroAdd: () => import(routerConfig.components.systemintroAdd)
};

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: `/${routerConfig.paths.index}/${routerConfig.paths.home}`
    },
		{
			path: routerConfig.paths.index,
			component: components.Index,
			children:[
				{
					path: routerConfig.paths.home,
					component: components.Home
				},
				{
					path: routerConfig.paths.center,
					component: components.Center,
				},
				{
					path: routerConfig.paths.pay,
					component: components.payList,
				},
				{
					path: routerConfig.paths.storeup,
					component: components.Storeup
				},
				{
					path: routerConfig.paths.news,
					component: components.News
				},
				{
					path: routerConfig.paths.newsDetail,
					component: components.NewsDetail
				},
				{
					path: routerConfig.paths.yonghu,
					component: components.yonghuList
				},
				{
					path: routerConfig.paths.yonghuDetail,
					component: components.yonghuDetail
				},
				{
					path: routerConfig.paths.yonghuAdd,
					component: components.yonghuAdd
				},
				{
					path: routerConfig.paths.historyinfo,
					component: components.historyinfoList
				},
				{
					path: routerConfig.paths.historyinfoDetail,
					component: components.historyinfoDetail
				},
				{
					path: routerConfig.paths.historyinfoAdd,
					component: components.historyinfoAdd
				},
				{
					path: routerConfig.paths.topten,
					component: components.toptenList
				},
				{
					path: routerConfig.paths.toptenDetail,
					component: components.toptenDetail
				},
				{
					path: routerConfig.paths.toptenAdd,
					component: components.toptenAdd
				},
				{
					path: routerConfig.paths.gupiaoxinxi,
					component: components.gupiaoxinxiList
				},
				{
					path: routerConfig.paths.gupiaoxinxiDetail,
					component: components.gupiaoxinxiDetail
				},
				{
					path: routerConfig.paths.gupiaoxinxiAdd,
					component: components.gupiaoxinxiAdd
				},
				{
					path: routerConfig.paths.gupiaoleixing,
					component: components.gupiaoleixingList
				},
				{
					path: routerConfig.paths.gupiaoleixingDetail,
					component: components.gupiaoleixingDetail
				},
				{
					path: routerConfig.paths.gupiaoleixingAdd,
					component: components.gupiaoleixingAdd
				},
				{
					path: routerConfig.paths.gupiaojiaoyi,
					component: components.gupiaojiaoyiList
				},
				{
					path: routerConfig.paths.gupiaojiaoyiDetail,
					component: components.gupiaojiaoyiDetail
				},
				{
					path: routerConfig.paths.gupiaojiaoyiAdd,
					component: components.gupiaojiaoyiAdd
				},
				{
					path: routerConfig.paths.newstype,
					component: components.newstypeList
				},
				{
					path: routerConfig.paths.newstypeDetail,
					component: components.newstypeDetail
				},
				{
					path: routerConfig.paths.newstypeAdd,
					component: components.newstypeAdd
				},
				{
					path: routerConfig.paths.systemintro,
					component: components.systemintroList
				},
				{
					path: routerConfig.paths.systemintroDetail,
					component: components.systemintroDetail
				},
				{
					path: routerConfig.paths.systemintroAdd,
					component: components.systemintroAdd
				},
			]
		},
		{
			path: routerConfig.paths.login,
			component: components.Login
		},
		{
			path: routerConfig.paths.register,
			component: components.Register
		},
	]
})
