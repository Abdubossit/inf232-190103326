function change(element) {
  var a = element.innerHTML;
  switch(a){
    case "Mac":
        document.getElementById("img").src = "mac.jpg";
        document.getElementById("").innerHTML = "27-inch model <br> iMac The all-in-one for all.";
        break;
    case "iPad":
        document.getElementById("img").src = "ipad.jpg";
        document.getElementById("text").innerHTML = "iPad Air <br> Powerful. Colorful. Wonderful.";
        break;
    case "iPhone":
        document.getElementById("img").src = "iphone.jpg";
        document.getElementById("text").innerHTML = "iPhone 12 <br> Blast past fast.";
        break;
    case "Watch":
        document.getElementById("img").src = "iwatch.jpg";
        document.getElementById("text").innerHTML = "Heavy on features.<br> Light on price.";
        break;
    case "Music":
        document.getElementById("img").src = "music.jpg";
        document.getElementById("text").innerHTML = "The music you love. On the go.";
        break;
    case "Support":
        document.getElementById("img").src = "";
        break;

  }
  $("img").animate({left: '+=50px'}, "slow");
  $("img").animate({left: '-=50px'}, "slow");
}
function macchange(){
  document.getElementById("img").src = "mac.jpg";
  document.getElementById("text").innerHTML = "27-inch model <br> iMac The all-in-one for all.";
    document.getElementById("text1").innerHTML = " apple";
    
}
function ipadchange(){
  document.getElementById("img").src = "ipad.jpg";
  document.getElementById("text").innerHTML = "iPad Air <br> Powerful. Colorful. Wonderful.";
      document.getElementById("text1").innerHTML = " apple";
}
function iphonechange(){
  document.getElementById("img").src = "iphone.jpg";
  document.getElementById("text").innerHTML = "iPhone 12 <br> Blast past fast.";
      document.getElementById("text1").innerHTML = " apple";
}
function watchchange(){
  document.getElementById("img").src = "iwatch.jpg";
  document.getElementById("text").innerHTML = "Heavy on features.<br> Light on price.";
      document.getElementById("text1").innerHTML = " apple";
}
function musicchange(){
  document.getElementById("img").src = "music.jpg";
  document.getElementById("text").innerHTML = "The music you love. On the go.";
      document.getElementById("text1").innerHTML = " apple";
}
function supportchange(){
    document.getElementById("img").src = "";
    document.getElementById("text").innerHTML = "Some counterfeit and third party power adapters and batteries may not be designed properly and could<br> result in safety issues. To ensure you receive a genuine Apple battery during a battery replacement, we<br> recommend visiting an Apple Store or Apple Authorized Service Provider. If you need a replacement<br> adapter to charge your Apple device, we recommend getting an Apple power adapter. ";
        document.getElementById("text1").innerHTML = "  ";
}
