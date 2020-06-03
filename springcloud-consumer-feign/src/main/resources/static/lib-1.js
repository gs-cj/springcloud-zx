$(document).ready(function($) {
    // mobile导航
	$('.menuBtn').click(function(e) {
        $(this).toggleClass('on');
        e.stopPropagation();
        if($(this).hasClass('on')){
            $('.header .so-box').slideUp();
            $('#aside').slideDown();
        }else{
            $('#aside').slideUp();
        }
	});
	$('#aside').click(function(e) {
		e.stopPropagation();
	});
	$(document).on('click',function(){
        $('.menuBtn').removeClass('on');
        $('#aside').slideUp();
	});

    $('#nav li').hover(function() {
        $('#aside').slideUp();
        $(this).find('.sub-box').stop().slideToggle();
    });

    $('.header .so-btn').click(function(event) {
        /* Act on the event */
        $('.header .so-box').slideToggle();
    });

    $('.a-member').hover(function() {
        $('.box-member').stop().toggle();
    });

    //手机二级菜单
    $('.menu li > a').click(function(){
        var sub = $(this).parents('li').find('dl');
        if( !sub.length > 0){
            return true;
        }
        if(sub.is(':visible')){
            sub.slideUp();
            $(this).parents('li').removeClass('open');
        }else{
            $('dl').slideUp();
            sub.slideDown();
            $(this).parents('li').addClass('open');
        }
        return false;
    })

    // 选项卡 鼠标点击
    $(".TAB_CLICK li").click(function(){
      var tab=$(this).parent(".TAB_CLICK");
      var con=tab.attr("id");
      var on=tab.find("li").index(this);
      $(this).addClass('on').siblings(tab.find("li")).removeClass('on');
      $(con).eq(on).show().siblings(con).hide();
    });
    $('.TAB_CLICK').each(function(index, el) {
        $(this).find('li').filter(':first').trigger('click');
    });

    // 底部导航
    function myFnav(){
        var _winw = $(window).width();
        $('.fd-t dl').removeClass('open');
        if( _winw > 999){
            $('.fd-t dd').show();
        }else{
            $('.fd-t dd').hide();
        }
    }

    $('.fd-t dt').click(function(){
        var _winw = $(window).width();
        if( _winw < 1000 ){
            var _pare = $(this).parent('dl');
            _pare.siblings('dl').removeClass('open');
            _pare.siblings('dl').find('dd').stop().slideUp();
            _pare.toggleClass('open');
            if( _pare.hasClass('open') ){
                _pare.find('dd').stop().slideDown();
            }else{
                _pare.find('dd').stop().slideUp();
            }
        }
    });
    
    $(window).resize(function(event) {
       myFnav();
    });
    myFnav();

    //内页banner
    $('.sl-banner').slick({
        fade: true,
        autoplay: false,
        dots: false,
        arrows:false,
        zIndex: 3,
        customPaging: function() {
            return '';
        },
    });

    $('.cur-tit li').click(function(event) {
        $('.sl-banner').slick('slickGoTo',$(this).index());
    });
})