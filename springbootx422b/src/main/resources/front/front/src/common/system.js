export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除"],"menu":"党员","menuJump":"列表","tableName":"dangyuan"}],"menu":"党员管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除","查看评论"],"menu":"活动公告","menuJump":"列表","tableName":"huodonggonggao"}],"menu":"活动公告管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学习内容","menuJump":"列表","tableName":"xuexineirong"}],"menu":"学习内容管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"党费缴纳","menuJump":"列表","tableName":"dangfeijiaona"}],"menu":"党费缴纳管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","导出"],"menu":"例会记录","menuJump":"列表","tableName":"lihuijilu"}],"menu":"例会记录管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除","审核"],"menu":"入党申请","menuJump":"列表","tableName":"rudangshenqing"}],"menu":"入党申请管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改","删除","审核"],"menu":"发展对象","menuJump":"列表","tableName":"fazhanduixiang"}],"menu":"发展对象管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","修改","删除","审核"],"menu":"支部大会","menuJump":"列表","tableName":"zhibudahui"}],"menu":"支部大会管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","审核"],"menu":"预备党员","menuJump":"列表","tableName":"yubeidangyuan"}],"menu":"预备党员管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","修改","删除","审核"],"menu":"预备转正","menuJump":"列表","tableName":"yubeizhuanzheng"}],"menu":"预备转正管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"活动类型","menuJump":"列表","tableName":"huodongleixing"}],"menu":"活动类型管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"考核试卷管理","tableName":"exampaper"}],"menu":"考核试卷管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"系统公告","tableName":"news"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-read","buttons":["新增","查看","修改","删除"],"menu":"考核记录","tableName":"examrecord"}],"menu":"考核管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"活动公告列表","menuJump":"列表","tableName":"huodonggonggao"}],"menu":"活动公告模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"学习内容列表","menuJump":"列表","tableName":"xuexineirong"}],"menu":"学习内容模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","删除","发展对象"],"menu":"入党申请","menuJump":"列表","tableName":"rudangshenqing"}],"menu":"入党申请管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","支部大会"],"menu":"发展对象","menuJump":"列表","tableName":"fazhanduixiang"}],"menu":"发展对象管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","预备党员"],"menu":"支部大会","menuJump":"列表","tableName":"zhibudahui"}],"menu":"支部大会管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","预备转正"],"menu":"预备党员","menuJump":"列表","tableName":"yubeidangyuan"}],"menu":"预备党员管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"预备转正","menuJump":"列表","tableName":"yubeizhuanzheng"}],"menu":"预备转正管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"活动公告列表","menuJump":"列表","tableName":"huodonggonggao"}],"menu":"活动公告模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"学习内容列表","menuJump":"列表","tableName":"xuexineirong"}],"menu":"学习内容模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","支付"],"menu":"党费缴纳","menuJump":"列表","tableName":"dangfeijiaona"}],"menu":"党费缴纳管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"活动公告列表","menuJump":"列表","tableName":"huodonggonggao"}],"menu":"活动公告模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"学习内容列表","menuJump":"列表","tableName":"xuexineirong"}],"menu":"学习内容模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"党员","tableName":"dangyuan"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
