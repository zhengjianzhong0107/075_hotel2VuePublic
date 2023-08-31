$( document ).ready(function() {
$('#cssmenu > ul > li > a').click(function() {
  $('#cssmenu li').removeClass('active');
  $(this).closest('li').addClass('active');	
  var checkElement = $(this).next();
  if((checkElement.is('ul')) && (checkElement.is(':visible'))) {
    $(this).closest('li').removeClass('active');
    checkElement.slideUp('normal');
  }
  if((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
    $('#cssmenu ul ul:visible').slideUp('normal');
    checkElement.slideDown('normal');
  }
  if($(this).closest('li').find('ul').children().length == 0) {
    return true;
  } else {
    return false;	
  }		
});
});


// Login Form
$(function() {
    var button = $('#loginButton');
    var box = $('#loginBox');
    var form = $('#loginForm');
    button.removeAttr('href');
    button.mouseup(function(login) {
    	regbox.hide();
        box.toggle();
        button.toggleClass('active');
    });
    form.mouseup(function() { 
        return false;
    });
    $(this).mouseup(function(login) {
        if(!($(login.target).parent('#loginButton').length > 0)) {
            button.removeClass('active');
            box.hide();
        }
    });
    
    var regbutton = $('#regButton');
    var regbox = $('[id="loginBox"]:eq(1)');
    var regform = $('[id="loginForm"]:eq(1)');
    regbutton.removeAttr('href');
    regbutton.mouseup(function(login) {
    	box.hide();
        regbox.toggle();
        regbutton.toggleClass('active');
    });
    regform.mouseup(function() { 
        return false;
    });
    $(this).mouseup(function(reg) {
        if(!($(reg.target).parent('#regButton').length > 0)) {
            regbutton.removeClass('active');
            regbox.hide();
        }
    });
});