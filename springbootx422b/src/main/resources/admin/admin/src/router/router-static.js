import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import adminexam from '@/views/modules/exampaperlist/exam'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import discusshuodonggonggao from '@/views/modules/discusshuodonggonggao/list'
    import lihuijilu from '@/views/modules/lihuijilu/list'
    import examquestion from '@/views/modules/examquestion/list'
    import yubeidangyuan from '@/views/modules/yubeidangyuan/list'
    import yubeizhuanzheng from '@/views/modules/yubeizhuanzheng/list'
    import exampaper from '@/views/modules/exampaper/list'
    import zhibudahui from '@/views/modules/zhibudahui/list'
    import dangyuan from '@/views/modules/dangyuan/list'
    import systemintro from '@/views/modules/systemintro/list'
    import huodonggonggao from '@/views/modules/huodonggonggao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussxuexineirong from '@/views/modules/discussxuexineirong/list'
    import xuexineirong from '@/views/modules/xuexineirong/list'
    import dangfeijiaona from '@/views/modules/dangfeijiaona/list'
    import rudangshenqing from '@/views/modules/rudangshenqing/list'
    import config from '@/views/modules/config/list'
    import examrecord from '@/views/modules/examrecord/list'
    import fazhanduixiang from '@/views/modules/fazhanduixiang/list'
    import huodongleixing from '@/views/modules/huodongleixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/discusshuodonggonggao',
        name: '活动公告评论',
        component: discusshuodonggonggao
      }
      ,{
	path: '/lihuijilu',
        name: '例会记录',
        component: lihuijilu
      }
      ,{
	path: '/examquestion',
        name: '试题管理',
        component: examquestion
      }
      ,{
	path: '/yubeidangyuan',
        name: '预备党员',
        component: yubeidangyuan
      }
      ,{
	path: '/yubeizhuanzheng',
        name: '预备转正',
        component: yubeizhuanzheng
      }
      ,{
	path: '/exampaper',
        name: '考核试卷管理',
        component: exampaper
      }
      ,{
	path: '/zhibudahui',
        name: '支部大会',
        component: zhibudahui
      }
      ,{
	path: '/dangyuan',
        name: '党员',
        component: dangyuan
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/huodonggonggao',
        name: '活动公告',
        component: huodonggonggao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussxuexineirong',
        name: '学习内容评论',
        component: discussxuexineirong
      }
      ,{
	path: '/xuexineirong',
        name: '学习内容',
        component: xuexineirong
      }
      ,{
	path: '/dangfeijiaona',
        name: '党费缴纳',
        component: dangfeijiaona
      }
      ,{
	path: '/rudangshenqing',
        name: '入党申请',
        component: rudangshenqing
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/examrecord',
        name: '考核记录',
        component: examrecord
      }
      ,{
	path: '/fazhanduixiang',
        name: '发展对象',
        component: fazhanduixiang
      }
      ,{
	path: '/huodongleixing',
        name: '活动类型',
        component: huodongleixing
      }
    ]
  },
  {
    path: '/adminexam',
    name: 'adminexam',
    component: adminexam,
    meta: {icon:'', title:'adminexam'}
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
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
