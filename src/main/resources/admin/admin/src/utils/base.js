const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootwlntdwu1/",
            name: "springbootwlntdwu1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootwlntdwu1/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网讯管理系统"
        } 
    }
}
export default base
