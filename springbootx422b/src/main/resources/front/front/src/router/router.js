import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import ExamPaper from '../pages/exam/examPaper'
import Exam from '../pages/exam/exam'
import ExamList from '../pages/exam/examList'
import ExamRecord from '../pages/exam/examRecord'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import dangyuanList from '../pages/dangyuan/list'
import dangyuanDetail from '../pages/dangyuan/detail'
import dangyuanAdd from '../pages/dangyuan/add'
import huodonggonggaoList from '../pages/huodonggonggao/list'
import huodonggonggaoDetail from '../pages/huodonggonggao/detail'
import huodonggonggaoAdd from '../pages/huodonggonggao/add'
import xuexineirongList from '../pages/xuexineirong/list'
import xuexineirongDetail from '../pages/xuexineirong/detail'
import xuexineirongAdd from '../pages/xuexineirong/add'
import dangfeijiaonaList from '../pages/dangfeijiaona/list'
import dangfeijiaonaDetail from '../pages/dangfeijiaona/detail'
import dangfeijiaonaAdd from '../pages/dangfeijiaona/add'
import lihuijiluList from '../pages/lihuijilu/list'
import lihuijiluDetail from '../pages/lihuijilu/detail'
import lihuijiluAdd from '../pages/lihuijilu/add'
import rudangshenqingList from '../pages/rudangshenqing/list'
import rudangshenqingDetail from '../pages/rudangshenqing/detail'
import rudangshenqingAdd from '../pages/rudangshenqing/add'
import fazhanduixiangList from '../pages/fazhanduixiang/list'
import fazhanduixiangDetail from '../pages/fazhanduixiang/detail'
import fazhanduixiangAdd from '../pages/fazhanduixiang/add'
import zhibudahuiList from '../pages/zhibudahui/list'
import zhibudahuiDetail from '../pages/zhibudahui/detail'
import zhibudahuiAdd from '../pages/zhibudahui/add'
import yubeidangyuanList from '../pages/yubeidangyuan/list'
import yubeidangyuanDetail from '../pages/yubeidangyuan/detail'
import yubeidangyuanAdd from '../pages/yubeidangyuan/add'
import yubeizhuanzhengList from '../pages/yubeizhuanzheng/list'
import yubeizhuanzhengDetail from '../pages/yubeizhuanzheng/detail'
import yubeizhuanzhengAdd from '../pages/yubeizhuanzheng/add'
import huodongleixingList from '../pages/huodongleixing/list'
import huodongleixingDetail from '../pages/huodongleixing/detail'
import huodongleixingAdd from '../pages/huodongleixing/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'

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
					path: 'examPaper',
					component: ExamPaper
				},
				{
					path: 'examList',
					component:ExamList
				},
				{
					path: 'examRecord/:type',
					component:ExamRecord
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
					path: 'dangyuan',
					component: dangyuanList
				},
				{
					path: 'dangyuanDetail',
					component: dangyuanDetail
				},
				{
					path: 'dangyuanAdd',
					component: dangyuanAdd
				},
				{
					path: 'huodonggonggao',
					component: huodonggonggaoList
				},
				{
					path: 'huodonggonggaoDetail',
					component: huodonggonggaoDetail
				},
				{
					path: 'huodonggonggaoAdd',
					component: huodonggonggaoAdd
				},
				{
					path: 'xuexineirong',
					component: xuexineirongList
				},
				{
					path: 'xuexineirongDetail',
					component: xuexineirongDetail
				},
				{
					path: 'xuexineirongAdd',
					component: xuexineirongAdd
				},
				{
					path: 'dangfeijiaona',
					component: dangfeijiaonaList
				},
				{
					path: 'dangfeijiaonaDetail',
					component: dangfeijiaonaDetail
				},
				{
					path: 'dangfeijiaonaAdd',
					component: dangfeijiaonaAdd
				},
				{
					path: 'lihuijilu',
					component: lihuijiluList
				},
				{
					path: 'lihuijiluDetail',
					component: lihuijiluDetail
				},
				{
					path: 'lihuijiluAdd',
					component: lihuijiluAdd
				},
				{
					path: 'rudangshenqing',
					component: rudangshenqingList
				},
				{
					path: 'rudangshenqingDetail',
					component: rudangshenqingDetail
				},
				{
					path: 'rudangshenqingAdd',
					component: rudangshenqingAdd
				},
				{
					path: 'fazhanduixiang',
					component: fazhanduixiangList
				},
				{
					path: 'fazhanduixiangDetail',
					component: fazhanduixiangDetail
				},
				{
					path: 'fazhanduixiangAdd',
					component: fazhanduixiangAdd
				},
				{
					path: 'zhibudahui',
					component: zhibudahuiList
				},
				{
					path: 'zhibudahuiDetail',
					component: zhibudahuiDetail
				},
				{
					path: 'zhibudahuiAdd',
					component: zhibudahuiAdd
				},
				{
					path: 'yubeidangyuan',
					component: yubeidangyuanList
				},
				{
					path: 'yubeidangyuanDetail',
					component: yubeidangyuanDetail
				},
				{
					path: 'yubeidangyuanAdd',
					component: yubeidangyuanAdd
				},
				{
					path: 'yubeizhuanzheng',
					component: yubeizhuanzhengList
				},
				{
					path: 'yubeizhuanzhengDetail',
					component: yubeizhuanzhengDetail
				},
				{
					path: 'yubeizhuanzhengAdd',
					component: yubeizhuanzhengAdd
				},
				{
					path: 'huodongleixing',
					component: huodongleixingList
				},
				{
					path: 'huodongleixingDetail',
					component: huodongleixingDetail
				},
				{
					path: 'huodongleixingAdd',
					component: huodongleixingAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
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
		{
			path: '/exam',
			component: Exam
		}
	]
})
