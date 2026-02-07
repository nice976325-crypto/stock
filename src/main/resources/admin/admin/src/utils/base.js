import config from '@/utils/config'

const base = {
    get() {
        return {
            url : config.apiBaseUrl + '/',
            name: "springbootnd27788u",
            // 退出到首页链接
            indexUrl: config.frontIndexUrl
        };
    },
    getProjectName(){
        return {
            projectName: config.systemName
        } 
    }
}
export default base
