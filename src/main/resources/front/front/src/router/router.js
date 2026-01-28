import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import xinwenxinxiList from '../pages/xinwenxinxi/list'
import xinwenxinxiDetail from '../pages/xinwenxinxi/detail'
import xinwenxinxiAdd from '../pages/xinwenxinxi/add'
import xinwenleibieList from '../pages/xinwenleibie/list'
import xinwenleibieDetail from '../pages/xinwenleibie/detail'
import xinwenleibieAdd from '../pages/xinwenleibie/add'
import xuexitiandiList from '../pages/xuexitiandi/list'
import xuexitiandiDetail from '../pages/xuexitiandi/detail'
import xuexitiandiAdd from '../pages/xuexitiandi/add'
import xuexileixingList from '../pages/xuexileixing/list'
import xuexileixingDetail from '../pages/xuexileixing/detail'
import xuexileixingAdd from '../pages/xuexileixing/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import discussxinwenxinxiList from '../pages/discussxinwenxinxi/list'
import discussxinwenxinxiDetail from '../pages/discussxinwenxinxi/detail'
import discussxinwenxinxiAdd from '../pages/discussxinwenxinxi/add'
import discussxuexitiandiList from '../pages/discussxuexitiandi/list'
import discussxuexitiandiDetail from '../pages/discussxuexitiandi/detail'
import discussxuexitiandiAdd from '../pages/discussxuexitiandi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'xinwenxinxi',
					component: xinwenxinxiList
				},
				{
					path: 'xinwenxinxiDetail',
					component: xinwenxinxiDetail
				},
				{
					path: 'xinwenxinxiAdd',
					component: xinwenxinxiAdd
				},
				{
					path: 'xinwenleibie',
					component: xinwenleibieList
				},
				{
					path: 'xinwenleibieDetail',
					component: xinwenleibieDetail
				},
				{
					path: 'xinwenleibieAdd',
					component: xinwenleibieAdd
				},
				{
					path: 'xuexitiandi',
					component: xuexitiandiList
				},
				{
					path: 'xuexitiandiDetail',
					component: xuexitiandiDetail
				},
				{
					path: 'xuexitiandiAdd',
					component: xuexitiandiAdd
				},
				{
					path: 'xuexileixing',
					component: xuexileixingList
				},
				{
					path: 'xuexileixingDetail',
					component: xuexileixingDetail
				},
				{
					path: 'xuexileixingAdd',
					component: xuexileixingAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'discussxinwenxinxi',
					component: discussxinwenxinxiList
				},
				{
					path: 'discussxinwenxinxiDetail',
					component: discussxinwenxinxiDetail
				},
				{
					path: 'discussxinwenxinxiAdd',
					component: discussxinwenxinxiAdd
				},
				{
					path: 'discussxuexitiandi',
					component: discussxuexitiandiList
				},
				{
					path: 'discussxuexitiandiDetail',
					component: discussxuexitiandiDetail
				},
				{
					path: 'discussxuexitiandiAdd',
					component: discussxuexitiandiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
