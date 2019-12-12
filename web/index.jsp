<%--
  Created by IntelliJ IDEA.
  User: temp
  Date: 12/12/19
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta content="text/html; charset=UTF-8" http-equiv="Content-Type"/>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1.0" name="viewport"/>
  <title>Rapport de TP ASGBD</title>

  <!-- CSS  -->
  <link href="css/materialize.css" media="screen,projection" rel="stylesheet" type="text/css"/>
  <link href="css/style.css" media="screen,projection" rel="stylesheet" type="text/css"/>
  <style>
    .clickable {
      cursor: pointer;
    }
  </style>
</head>
<body >


<nav class="nav-extended teal lighten-2">
  <div class="nav-wrapper">
    <a href="#" class="brand-logo center">SmallJava Editor</a>
    <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
    <ul id="nav-mobile" class="right hide-on-med-and-down">
      <li><a href=""><i class="material-icons">search</i></a></li>
      <li><a href=""><i class="material-icons">view_module</i></a></li>
      <li><a href=""><i class="material-icons">refresh</i></a></li>
      <li><a href=""><i class="material-icons">more_vert</i></a></li>
    </ul>
  </div>
  <div class="nav-content container">
    <ul class="tabs tabs-fixed-width tabs-transparent ">
      <li class="tab"><a class=" waves-effect waves-light active" href="#tab1">Programme.sj</a></li>
      <li class="tab"><a class=" waves-effect waves-light " href="#tab2">Quadreplet.quad</a></li>
      <li class="tab"><a class=" waves-effect waves-light " href="#tab3">ObjectCode.j</a></li>
    </ul>
    <a class="btn-floating btn-large halfway-fab waves-effect waves-light teal">
      <i class="material-icons">play_arrow</i>
    </a>
  </div>
</nav>

<ul class="sidenav" id="mobile-demo">
  <li><a href="sass.html">Sass</a></li>
  <li><a href="badges.html">Components</a></li>
  <li><a href="collapsible.html">JavaScript</a></li>
</ul>

<div id="tab1" class="container">
  <div id="editor">
    function foo(items) {
    var x = "All this is syntax highlighted";
    return x;
    }
  </div>
</div>
<div id="tab2" class="col s12">Test 2</div>
<div id="tab3" class="col s12">Test 4</div>


<div class="fixed">
  <footer class="page-footer blue-grey lighten-3">
    <div class="container">
      <div class="row">
        <div class="col l5 s12">
          <h5 class="white-text">Rapport de TP</h5>
          <p class="grey-text text-lighten-4">Université des Sciences et de la Technologie Houari Boumediene</p>
          <p class="grey-text text-lighten-4">Faculté d'Electronique et d'Informatique</p>

        </div>
        <div class="col l4 s12">
          <h5 class="white-text">TPs</h5>
          <ul>
            <li><a class="white-text" href="TP1.html">TP 1 Création et manipulation d'une BD</a></li>

          </ul>
        </div>
        <div class="col l3 s12">
          <h5 class="white-text">Contactez nous</h5>
          <ul>
            <li><a class="white-text" href="#!">khzouroussama@gmail.com</a></li>
            <li><a class="white-text" href="#!">khiat47@gmail.com</a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="footer-copyright">
      <div class="container">
        Made by <a class="orange-text text-lighten-3" href="#">Khezour Mohamed Oussama</a>
      </div>
    </div>
  </footer>

</div>
<!--  Scripts-->
<script src="js/http_code.jquery.com_jquery-2.1.1.js"></script>
<script src="js/materialize.js"></script>
<script src="js/init.js"></script>

<script src="aceEditor/ace-builds-master/src-noconflict/ace.js" type="text/javascript" charset="utf-8"></script>
<script>
  var editor = ace.edit("editor");
  editor.setTheme("ace/theme/monokai");
  editor.session.setMode("ace/mode/javascript");
</script>

</body>
</html>