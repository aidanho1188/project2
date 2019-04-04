<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-teal.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>

<div class="w3-sidebar w3-collapse w3-white w3-animate-left w3-large" style="z-index:3;width:300px;" id="mySidebar">

<div class="w3-bar w3-black w3-center">
  <a class="w3-bar-item w3-button" style="width:33.33%" href="javascript:void(0)" onclick="openNav('nav01')">
  <i class="fa fa-bars w3-xlarge"></i></a>
  <a class="w3-bar-item w3-button" style="width:33.33%" href="javascript:void(0)" onclick="openNav('nav03')">
  <i class="fa fa-file w3-xlarge"></i></a>
  <a class="w3-bar-item w3-button" style="width:33.33%" href="javascript:void(0)" onclick="openNav('nav02')">
  <i class="fa fa-camera w3-xlarge"></i></a>
</div>

<div id="nav01" class="w3-bar-block">
  <a class="w3-button w3-hover-teal w3-hide-large w3-large w3-right" href="javascript:void(0)" onclick="w3_close()">×</a>
  <a class="w3-bar-item w3-button w3-border-bottom w3-large" href="#"><img src="https://www.w3schools.com/images/w3schools.png" style="width:80%;"></a>
  <a class="w3-bar-item w3-button" href="#">Learn HTML</a>
  <a class="w3-bar-item w3-button" href="#">Learn W3.CSS</a>
  <a class="w3-bar-item w3-button" href="#">Learn JavaScript</a>
  <a class="w3-bar-item w3-button" href="#">Learn SQL</a>
  <a class="w3-bar-item w3-button" href="#">Learn PHP</a>
</div>

<div id="nav02">
  <a class="w3-bar-item w3-button" target="_blank" href="tryw3css_templates_black.htm"><img src="img_demo_black.png" style="width:100%;"></a>
  <a class="w3-bar-item w3-button" target="_blank" href="tryw3css_examples_album.htm"><img src="img_demo_summer.jpg" style="width:100%;"></a>
  <a class="w3-bar-item w3-button" target="_blank" href="tryw3css_examples_blog.htm"><img src="img_demo_blog.jpg" style="width:100%;"></a>
</div>

<div id="nav03">
  <div class="w3-container w3-border-bottom">
    <h1 class="w3-text-theme">W3.CSS</h1>
  </div>
  <ul class="w3-ul w3-large">  
   <li class="w3-padding-16">Smaller and faster</li>
   <li class="w3-padding-16">Easier to use</li>
   <li class="w3-padding-16">Easier to learn</li>
   <li class="w3-padding-16">CSS only</li>
   <li class="w3-padding-16">Speeds up apps</li>
   <li class="w3-padding-16">CSS equality for all</li>
   <li class="w3-padding-16">PC Laptop Tablet Mobile</li>
  </ul>
</div>
</div>

<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" id="myOverlay"></div>

<div class="w3-main" style="margin-left:300px;"> 

<div class="w3-top w3-theme w3-large w3-hide-large">
  <i class="fa fa-bars w3-button w3-teal w3-xlarge" onclick="w3_open()"></i>
</div>

<header class="w3-container w3-theme w3-padding-64 w3-center">
  <h1 class="w3-xxxlarge w3-padding-16">W3Schools.com</h1>
</header>

<div class="w3-container w3-padding-large w3-section w3-light-grey">
  <h1 class="w3-jumbo">CSS</h1>
  <p class="w3-xlarge">The Language for Styling Web Pages</p>
  <a class="w3-button w3-theme w3-hover-white" href="/css/default.asp">LEARN CSS</a>
  <a class="w3-button w3-theme w3-hover-white" href="/cssref/default.asp">CSS REFERENCE</a>
  <p class="w3-large">
  <p><div class="w3-code cssHigh notranslate">
  body {<br>
      background-color: #d0e4fe;<br>}<br>h1 {<br>
      color: orange;<br>
      text-align: center;<br>}<br>p {<br>
      font-family: "Times New Roman";<br>
      font-size: 20px;<br>}
  </div>
  <a class="w3-button w3-theme w3-hover-white" href="/css/tryit.asp?filename=trycss_default" target="_blank">Try it Yourself</a>
</div>

<div class="w3-container w3-padding-large w3-section w3-light-grey">
  <h1 class="w3-jumbo">JavaScript</h1>
  <p class="w3-xlarge">The Language for Programming Web Pages</p>
  <a href="/js/default.asp" class="w3-button w3-theme w3-hover-white">LEARN JS</a>
  <a href="/jsref/default.asp" class="w3-button w3-theme w3-hover-white">JS REFERENCE</a>

  <p><div class="w3-code jsHigh notranslate">
   // Click the button to change the color of this paragraph<br><br>function myFunction() {<br>
      var x;<br>
      x = document.getElementById("demo");<br>
      x.style.fontSize = "25px"; <br>
      x.style.color = "red"; <br>}
  </div>
  <a class="w3-button w3-theme w3-hover-white" href="/js/tryit.asp?filename=tryjs_default" target="_blank">Try it Yourself</a>
</div>

<footer class="w3-container w3-padding-large w3-light-grey w3-justify w3-opacity">
  <p><nav>
  <a href="/forum/default.asp" target="_blank">FORUM</a> |
  <a href="/about/default.asp" target="_top">ABOUT</a>
  </nav></p>
</footer>

</div>

<script>
function w3_open() {
  document.getElementById("mySidebar").style.display = "block";
  document.getElementById("myOverlay").style.display = "block";
}

function w3_close() {
  document.getElementById("mySidebar").style.display = "none";
  document.getElementById("myOverlay").style.display = "none";
}

openNav("nav01");
function openNav(id) {
  document.getElementById("nav01").style.display = "none";
  document.getElementById("nav02").style.display = "none";
  document.getElementById("nav03").style.display = "none";
  document.getElementById(id).style.display = "block";
}
</script>

<script src="https://www.w3schools.com/lib/w3codecolor.js"></script>

<script>
w3CodeColor();
</script>

</body>
</html> 
