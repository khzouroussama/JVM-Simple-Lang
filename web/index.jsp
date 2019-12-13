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

        #toast-container {
            top: 15%;
            right: auto !important;
            bottom: auto !important;
            left: 85%;
        }

    </style>
</head>
<body>


<nav class="nav-extended  light-blue darken-2">
    <div class="nav-wrapper">
        <a href="#" class="brand-logo center"><i class="material-icons">code</i>SmallJava Editor</a>
        <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href=""><i class="material-icons">search</i></a></li>
            <li><a href=""><i class="material-icons">apps</i></a></li>
            <li><a href=""><i class="material-icons">refresh</i></a></li>
            <li><a href=""><i class="material-icons">more_vert</i></a></li>
        </ul>
    </div>
    <div class="nav-content container">
        <ul class="tabs tabs-transparent">
            <li class="tab"><a class=" waves-effect waves-light active" href="#tab1">Programme.sj</a></li>
            <li class="tab"><a class=" waves-effect waves-light " href="#tab2">Quadreplet.quad</a></li>
            <li class="tab"><a class=" waves-effect waves-light " href="#tab3">ObjectCode.j</a></li>
        </ul>
        <div id="build-app">
            <a class="btn-floating btn-large halfway-fab waves-effect waves-light teal lighten-3 tooltipped"
               data-position="top" data-tooltip="Build" style="right: 90px"
               v-on:click="build">
                <i class="material-icons">build</i>
            </a>
            <a class="btn-floating btn-large halfway-fab waves-effect waves-light red lighten-3 tooltipped"
               data-position="top" data-tooltip="Run">
                <i class="material-icons">play_arrow</i>
            </a>
        </div>
    </div>
</nav>

<ul class="sidenav" id="mobile-demo">
    <li><a href="sass.html">Sass</a></li>
    <li><a href="badges.html">Components</a></li>
    <li><a href="collapsible.html">JavaScript</a></li>
</ul>

<br>
<div id="tab1" class="container">
    <div class="row">
        <div class="col s12">
            <div class="edit card" id="editor1">
                import Small_Java.lang ;

                protected sj_class SmallJava {

                MainSj{
                sj_int x , z ;
                sj_float y ;

                x := x * 5 / 3.2 ;
                }
                }
            </div>
        </div>
    </div>
</div>
<div id="tab2" class="container">
    <div class="row">
        <div class="col s8 push-s2">
            <div class="edit card">
                <table class="centered highlight">
                    <thead>
                    <tr>
                        <th>OP</th>
                        <th>OP1</th>
                        <th>OP2</th>
                        <th>RES</th>
                    </tr>
                    </thead>

                    <tbody id="print-quads">
                    <tr v-for="quad in quads[0]">
                        <td>{{ quad[0] }}</td>
                        <td>{{ quad[1] }}</td>
                        <td>{{ quad[2] }}</td>
                        <td>{{ quad[3] }}</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<div id="tab3" class="container">
    <div class="row">
        <div class="col s12">
            <div class="edit card" id="editor3">
                function foo(items) {
                var x = "All this is syntax highlighted";
                var x = "All this is syntax highlighted";
                var x = "All this is syntax highlighted";
                var x = "All this is syntax highlighted";
                var x = "All this is syntax highlighted";
                return x;
                }
            </div>
        </div>
    </div>
</div>

<div class="container">
    <div class="card light-blue lighten-3 ">

        <div class="col s12 center-align teal-text "><i class="material-icons">laptop_mac</i>Output</div>

        <div class="row">
            <div class="col s12">
                <div class="edit card" id="editorOutput">
                    13-Dec-2019 00:22:52.564 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command
                    line
                    argument: -Dcatalina.base=/home/temp/.IntelliJIdea2019.2/system/tomcat/Tomcat_9_0_291_AntlrExps_2
                    13-Dec-2019 00:22:52.565 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command
                    line
                    argument: -Dcatalina.home=/home/temp/IdeaProjects/AntlrExps/libs/apache-tomcat-9.0.29
                    13-Dec-2019 00:22:52.565 INFO [main] org.apache.catalina.startup.VersionLoggerListener.log Command
                    line
                    argument: -Djava.io.tmpdir=/home/temp/IdeaProjects/AntlrExps/libs/apache-tomcat-9.0.29/temp
                    13-Dec-2019 00:22:52.565 INFO [main] org.apache.catalina.core.AprLifecycleListener.lifecycleEvent
                    The APR
                    based Apache Tomcat Native library which allows optimal performance in production environments was
                    not found
                    on the java.library.path: [/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib]
                    13-Dec-2019 00:22:52.995 INFO [main] org.apache.coyote.AbstractProtocol.init Initializing
                    ProtocolHandler
                    ["http-nio-8085"]
                    13-Dec-2019 00:22:53.051 INFO [main] org.apache.coyote.AbstractProtocol.init Initializing
                    ProtocolHandler
                    ["ajp-nio-8009"]
                    13-Dec-2019 00:22:53.070 INFO [main] org.apache.catalina.startup.Catalina.load Server initialization
                    in [892]
                    milliseconds
                    13-Dec-2019 00:22:53.161 INFO [main] org.apache.catalina.core.StandardService.startInternal Starting
                    service
                    [Catalina]
                </div>
            </div>
        </div>
    </div>
</div>


<!--  Scripts-->
<script src="js/http_code.jquery.com_jquery-2.1.1.js"></script>
<script src="js/materialize.js"></script>
<script src="aceEditor/ace-builds-master/src-noconflict/ace.js" type="text/javascript" charset="utf-8"></script>

<script src="js/vue.js"></script>
<script src="js/axios.js"></script>
<script src="js/init.js"></script>

<script>

    var printQuadsApp = new Vue({
            el: '#print-quads',
            data: {
                quads: []
            }
        }
        // define methods under the `methods` object
    );

    var buildapp = new Vue({
        el: '#build-app',
        data: {
            cis: ''
        },
        // define methods under the `methods` object
        methods: {
            build: function (event) {
                // axios
                //     .get('Build' , {
                //       code : 'bla'
                //     })
                //     .then(function (response) {
                //         this.cis = (response.data);
                //         editor3.setValue(this.cis.JVM.replace(/##/g, '\n'));
                //         Vue.set(printQuadsApp.quads,0,this.cis.quads);
                //
                //         M.toast({
                //           html: '<i class="material-icons">done_all</i> Programme a ete compiler avec success!', classes: ' teal  lighten-3  toastFix'
                //         });
                //     }).catch(function (reason) {
                //       M.toast({
                //           html: '<i class="material-icons">not_interested</i> '+reason, classes: ' red lighten-3  toastFix'
                //       }); }
                // );

                var headers = {
                    "Content-Type": "application/json",
                    "Access-Control-Origin": "*"
                };
                fetch('Build', {
                    method: 'POST',
                    headers: headers,
                    body: JSON.stringify({code: editor1.getValue()})
                }).then(res => res.json())
                .then( res => {
                      this.cis = (res.data);
                      editor3.setValue(this.cis.JVM.replace(/##/g, '\n'));
                      Vue.set(printQuadsApp.quads,0,this.cis.quads);
                })
                ;


                // editor2.setValue(this.quads.quads)

            }
        }
    })


</script>

</body>
</html>