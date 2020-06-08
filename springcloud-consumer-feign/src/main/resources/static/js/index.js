var interval = 3000;                //轮播间隔时间
var arrowL = $('#arrow_l');         //左侧箭头
var arrowR = $('#arrow_r');         //右侧箭头

var slideBox = $('#slide');         //轮播图区域
var innerBox = $('#inner');         //内层大盒子
var img = innerBox.children('li');  //每个图片
var dot = $('#dot');                //小圆点盒子

var imgW = $(img[0]).outerWidth();  //每个li标签的宽度

var imgCount = 5;                   //总图片个数（不同图片的个数）（实际dom上是有7张）
var i = 0;                          //初始化为第0张图片
timer = null;                       //定时器

//自动轮播
timer = setInterval(function () {
    i++;
    innerBox.stop(false, true).animate({'left':-i*imgW+'px'},300)
    dot.find('li').removeClass('active').eq(i-1).addClass('active')
    if(i > imgCount){
        innerBox.animate({'left':-1*imgW+'px'},0);
        dot.find('li').removeClass('active').eq(0).addClass('active')
        i = 1;
    }
},interval)

//点击右侧箭头，播放下一张
arrowR.click(function () {
    i++;
    innerBox.stop(false, true).animate({'left':-i*imgW+'px'},300)
    dot.find('li').removeClass('active').eq(i-1).addClass('active')
    if(i > imgCount){
        innerBox.animate({'left':-1*imgW+'px'},0);
        dot.find('li').removeClass('active').eq(0).addClass('active')
        i = 1;
    }
})

//点击左侧箭头，播放上一张
arrowL.click(function () {
    i--;
    innerBox.stop(false, true).animate({'left':-i*imgW+'px'},300)
    dot.find('li').removeClass('active').eq(i-1).addClass('active')
    if(i < 1){
        innerBox.animate({'left':-imgCount*imgW+'px'},0);
        dot.find('li').removeClass('active').eq(imgCount-1).addClass('active')
        i = imgCount;
    }
})

//鼠标经过轮播图区域时，清除定时器，停止自动轮播
slideBox.mouseenter(function () {
    clearInterval(timer);
})

//鼠标离开轮播图区域时，重新启动自动轮播
slideBox.mouseleave(function () {
    timer = setInterval(function () {
        i++;
        innerBox.stop(false, true).animate({'left':-i*imgW+'px'},300)
        dot.find('li').removeClass('active').eq(i-1).addClass('active')
        if(i > imgCount){
            innerBox.animate({'left':-1*imgW+'px'},0);
            dot.find('li').removeClass('active').eq(0).addClass('active')
            i = 1;
        }
    },interval)
})