export default {
    // 项目基础路径
    basePath: '/nolan',
    // API基础路径
    apiBaseUrl: '/nolan',
    // 基础URL
    baseUrl: '/nolan',
    // 前端首页路径
    frontIndexUrl: '/nolan/front/dist/index.html',
    // 管理端首页路径
    adminIndexUrl: '/nolan/admin/dist/index.html',
    // 上传文件路径
    uploadPath: '/nolan/common/upload',
    // 系统名称
    systemName: '基于Java的股票交易分析系统设计与实现',
    // 版本号
    version: '1.0.0',
    // 导航配置
    indexNav: [
        {
            name: '历史数据',
            url: '/index/historyinfo'
        },
        {
            name: '十大成交股',
            url: '/index/topten'
        },
        {
            name: '股票信息',
            url: '/index/gupiaoxinxi'
        },
        {
            name: '股票资讯',
            url: '/index/news'
        },
    ]
}
