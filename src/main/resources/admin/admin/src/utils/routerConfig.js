// 管理端路由配置
const routerConfig = {
  // 主路由路径
  paths: {
    home: '/',
    updatePassword: '/updatePassword',
    pay: '/pay',
    center: '/center',
    news: '/news',
    systemintro: '/systemintro',
    gupiaoleixing: '/gupiaoleixing',
    yonghu: '/yonghu',
    historyinfo: '/historyinfo',
    chat: '/chat',
    gupiaoxinxi: '/gupiaoxinxi',
    topten: '/topten',
    gupiaojiaoyi: '/gupiaojiaoyi',
    config: '/config',
    newstype: '/newstype',
    login: '/login',
    board: '/board',
    register: '/register'
  },
  
  // 路由组件映射
  components: {
    Index: '@/views/index',
    Home: '@/views/home',
    Board: '@/views/board',
    Login: '@/views/login',
    NotFound: '@/views/404',
    UpdatePassword: '@/views/update-password',
    pay: '@/views/pay',
    register: '@/views/register',
    center: '@/views/center',
    news: '@/views/modules/news/list',
    systemintro: '@/views/modules/systemintro/list',
    gupiaoleixing: '@/views/modules/gupiaoleixing/list',
    yonghu: '@/views/modules/yonghu/list',
    historyinfo: '@/views/modules/historyinfo/list',
    chat: '@/views/modules/chat/list',
    gupiaoxinxi: '@/views/modules/gupiaoxinxi/list',
    topten: '@/views/modules/topten/list',
    gupiaojiaoyi: '@/views/modules/gupiaojiaoyi/list',
    config: '@/views/modules/config/list',
    newstype: '@/views/modules/newstype/list'
  }
};

export default routerConfig;