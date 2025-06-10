const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootx422b/",
            name: "springbootx422b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootx422b/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "Java高校党支部党务管理系统"
        } 
    }
}
export default base
