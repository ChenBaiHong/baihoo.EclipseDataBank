/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-07-29 15:10:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.webpage.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/F:/Eclipse%20DataBank/EclipseDevelop_JavaEE2/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Estore-console-web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1449022773000L));
    _jspx_dependants.put("jar:file:/F:/Eclipse%20DataBank/EclipseDevelop_JavaEE2/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Estore-console-web/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0-rt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/F:/Eclipse%20DataBank/EclipseDevelop_JavaEE2/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Estore-console-web/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /webpage/login/login.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /webpage/login/login.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("  <meta charset=\"utf-8\" />\n");
      out.write("  ");
      out.write("\n");
      out.write("   <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("  <!-- bootstrap & fontawesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/css/bootstrap.css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/css/font-awesome.css\" />\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/accordion/css/accordion.css\">\n");
      out.write("  <!-- text fonts -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/css/ace-fonts.css\" />\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/css/jquery-ui.css\" />\n");
      out.write("  <!-- ace styles -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/css/ace.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("  <!-- ace settings handler -->\n");
      out.write("  <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/ace/js/ace-extra.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("  <!--[if lte IE 8]>\n");
      out.write("  <script src=\"plug-in/ace/js/html5shiv.js\"></script>\n");
      out.write("  <script src=\"plug-in/ace/js/respond.js\"></script>\n");
      out.write("  <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"login-layout light-login\">\n");
      out.write("<div class=\"main-container\">\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("          <div class=\"center\">\n");
      out.write("            <h1 id=\"id-text2\" class=\"grey\">\n");
      out.write("              <i class=\"ace-icon fa fa-leaf green\"></i>\n");
      out.write("               ESTORE-後臺登陸\n");
      out.write("            </h1>\n");
      out.write("            <h4 class=\"blue\" id=\"id-company-text\">www.baihoo.com</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"space-6\"></div>\n");
      out.write("          <div class=\"position-relative\">\n");
      out.write("            <div id=\"login-box\" class=\"login-box visible widget-box no-border\">\n");
      out.write("              <div class=\"widget-body\">\n");
      out.write("                <!--update-begin--Author:zhangliang  Date:20170628 for：TASK #2116 【性能问题】优化登录逻辑---------------------->\n");
      out.write("                <form id=\"loinForm\" class=\"form-horizontal\"    method=\"post\">\n");
      out.write("                <!--update-end--Author:zhangliang  Date:20170628 for：TASK #2116 【性能问题】优化登录逻辑---------------------->\n");
      out.write("                <!-- add-begin--Author:zhoujf  Date:20170602 for:单点登录 -->\n");
      out.write("                <input type=\"hidden\" id=\"ReturnURL\"  name=\"ReturnURL\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ReturnURL }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                <!-- add-end--Author:zhoujf  Date:20170602 for:单点登录 -->\n");
      out.write("                <div class=\"widget-main\">\n");
      out.write("                 <div class=\"alert alert-warning alert-dismissible\" role=\"alert\" id=\"errMsgContiner\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t  <div id=\"showErrMsg\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                  <h4 class=\"header blue lighter bigger\">\n");
      out.write("                    <i class=\"ace-icon fa fa-coffee green\"></i>\n");
      out.write("                \t    用户登录\n");
      out.write("                  </h4>\n");
      out.write("                  <div class=\"space-6\"></div>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- update-start--Author:yugwu  Date:20170901 for:TASK #2324 【改进】登录记住用户名不起作用---- -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\"  name=\"userName\" iscookie=\"true\" class=\"form-control\" placeholder=\"请输入用户名\"  id=\"userName\" value=\"admin\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- update-end--Author:yugwu  Date:20170901 for:TASK #2324 【改进】登录记住用户名不起作用---- -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"请输入密码\" id=\"password\" value=\"123456\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-lock\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("                      </label>\n");
      out.write("                      <label class=\"block clearfix\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <input type=\"text\" style=\"width:150px\" name=\"randCode\" class=\"form-control\" placeholder=\"请输入验证码\"  id=\"randCode\"/>\n");
      out.write("                          <span class=\"input-group-addon\" style=\"padding: 0px;\"><img id=\"randCodeImage\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/randCodeImage\"  /></span>\n");
      out.write("                        </div>\n");
      out.write("                      </label>\n");
      out.write("                      <div class=\"space\"></div>\n");
      out.write("                      <div class=\"clearfix\">\n");
      out.write("                        <label class=\"inline\">\n");
      out.write("                          <input type=\"checkbox\" class=\"ace\" id=\"on_off\"  name=\"remember\" value=\"yes\"/>\n");
      out.write("                          <span class=\"lbl\">记住用户名</span>\n");
      out.write("                        </label>\n");
      out.write("                        <button type=\"button\" id=\"but_login\"  onclick=\"checkUser()\" class=\"width-35 pull-right btn btn-sm btn-primary\">\n");
      out.write("                          <i class=\"ace-icon fa fa-key\"></i>\n");
      out.write("                          <span class=\"bigger-110\" >登录</span>\n");
      out.write("                        </button>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"space-4\"></div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"toolbar clearfix\">\n");
      out.write("                  <div style=\"float: right\">\n");
      out.write("                     &nbsp;\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"center\"><h4 class=\"blue\" id=\"id-company-text\">&copy; BaiHoo-JEECG-V_3.7.1</h4></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/jquery/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/jquery/jquery.cookie.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/mutiLang/en.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/mutiLang/zh-cn.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/login/js/jquery.tipsy.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/login/js/iphone.check.js\"></script>\n");
      out.write("<!-- add-begin--Author:gengjiajia  Date:20160727 for:TASK #1217 【IE兼容】jeecg h+首页兼容性问题,不兼容的浏览器直接切换套shortcut风格 -->\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/plug-in/login/js/login.js\"></script>\n");
      out.write("<!-- add-end--Author:gengjiajia  Date:20160727 for:TASK #1217 【IE兼容】jeecg h+首页兼容性问题,不兼容的浏览器直接切换套shortcut风格 -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\toptErrMsg();\n");
      out.write("\t});\n");
      out.write("\t$(\"#errMsgContiner\").hide();\n");
      out.write("\tfunction optErrMsg(){\n");
      out.write("\t\t$(\"#showErrMsg\").html('');\n");
      out.write("\t\t$(\"#errMsgContiner\").hide();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("   //输入验证码，回车登录\n");
      out.write("  $(document).keydown(function(e){\n");
      out.write("  \tif(e.keyCode == 13) {\n");
      out.write("\n");
      out.write("      setTimeout(\"$('#but_login').click()\",\"100\");\n");
      out.write("\n");
      out.write("  \t}\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  //验证用户信息\n");
      out.write("  function checkUser(){\n");
      out.write("    if(!validForm()){\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    newLogin();\n");
      out.write("  }\n");
      out.write("  //表单验证\n");
      out.write("  function validForm(){\n");
      out.write("    if($.trim($(\"#userName\").val()).length==0){\n");
      out.write("      showErrorMsg(\"请输入用户名\");\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    if($.trim($(\"#password\").val()).length==0){\n");
      out.write("      showErrorMsg(\"请输入密码\");\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    if($.trim($(\"#randCode\").val()).length==0){\n");
      out.write("      showErrorMsg(\"请输入验证码\");\n");
      out.write("      return false;\n");
      out.write("    }\n");
      out.write("    return true;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  //登录处理函数\n");
      out.write("  function newLogin(orgId) {\n");
      out.write("    setCookie();\n");
      out.write("\n");
      out.write("    var actionurl=\"loginController.do?login\";//提交路径\n");
      out.write("    var checkurl=\"loginController.do?checkuser\";//验证路径\n");
      out.write("\n");
      out.write("    var formData = new Object();\n");
      out.write("    var data=$(\":input\").each(function() {\n");
      out.write("      formData[this.name] =$(\"#\"+this.name ).val();\n");
      out.write("    });\n");
      out.write("    formData['orgId'] = orgId ? orgId : \"\";\n");
      out.write("    //语言\n");
      out.write("    formData['langCode']=$(\"#langCode\").val();\n");
      out.write("    formData['langCode'] = $(\"#langCode option:selected\").val();\n");
      out.write("    $.ajax({\n");
      out.write("      async : false,\n");
      out.write("      cache : false,\n");
      out.write("      type : 'POST',\n");
      out.write("      url : checkurl,// 请求的action路径\n");
      out.write("      data : formData,\n");
      out.write("      error : function() {// 请求失败处理函数\n");
      out.write("      },\n");
      out.write("      success : function(data) {\n");
      out.write("        var d = $.parseJSON(data);\n");
      out.write("        if (d.success) {\n");
      out.write("          if (d.attributes.orgNum > 1) {\n");
      out.write("          \t  //用户拥有多个部门，需选择部门进行登录\n");
      out.write("        \t  var title, okButton;\n");
      out.write("              if($(\"#langCode\").val() == 'en') {\n");
      out.write("                title = \"Please select Org\";\n");
      out.write("                okButton = \"Ok\";\n");
      out.write("              } else {\n");
      out.write("                title = \"请选择组织机构\";\n");
      out.write("                okButton = \"确定\";\n");
      out.write("              }\n");
      out.write("            $.dialog({\n");
      out.write("              id: 'LHG1976D',\n");
      out.write("              title: title,\n");
      out.write("              max: false,\n");
      out.write("              min: false,\n");
      out.write("              drag: false,\n");
      out.write("              resize: false,\n");
      out.write("              content: 'url:userController.do?userOrgSelect&userId=' + d.attributes.user.id,\n");
      out.write("              lock:true,\n");
      out.write("              button : [ {\n");
      out.write("                name : okButton,\n");
      out.write("                focus : true,\n");
      out.write("                callback : function() {\n");
      out.write("                  iframe = this.iframe.contentWindow;\n");
      out.write("                  var orgId = $('#orgId', iframe.document).val();\n");
      out.write("\n");
      out.write("                  formData['orgId'] = orgId ? orgId : \"\";\n");
      out.write("                  $.ajax({\n");
      out.write("              \t\tasync : false,\n");
      out.write("              \t\tcache : false,\n");
      out.write("              \t\ttype : 'POST',\n");
      out.write("              \t\turl : 'loginController.do?changeDefaultOrg',// 请求的action路径\n");
      out.write("              \t\tdata : formData,\n");
      out.write("              \t\terror : function() {// 请求失败处理函数\n");
      out.write("              \t\t},\n");
      out.write("              \t\tsuccess : function(data) {\n");
      out.write("              \t\t\twindow.location.href = actionurl;\n");
      out.write("              \t\t}\n");
      out.write("                  });\n");
      out.write("\n");
      out.write("                  this.close();\n");
      out.write("                  return false;\n");
      out.write("                }\n");
      out.write("              }],\n");
      out.write("              close: function(){\n");
      out.write("                setTimeout(\"window.location.href='\"+actionurl+\"'\", 10);\n");
      out.write("              }\n");
      out.write("            });\n");
      out.write("          } else {\n");
      out.write("            window.location.href = actionurl;\n");
      out.write("          }\n");
      out.write("       } else {\n");
      out.write("\t\t\tshowErrorMsg(d.msg);\n");
      out.write("\n");
      out.write("\t\t  \tif(d.msg === \"用户名或密码错误\" || d.msg === \"验证码错误\")\n");
      out.write("\t\t  \t\treloadRandCodeImage();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("  //登录提示消息显示\n");
      out.write("  function showErrorMsg(msg){\t\n");
      out.write("    $(\"#errMsgContiner\").show();\n");
      out.write("    $(\"#showErrMsg\").html(msg);    \n");
      out.write("    window.setTimeout(optErrMsg,3000); \n");
      out.write("  }\n");
      out.write("  /**\n");
      out.write("   * 刷新验证码\n");
      out.write("   */\n");
      out.write("$('#randCodeImage').click(function(){\n");
      out.write("    reloadRandCodeImage();\n");
      out.write("});\n");
      out.write("function reloadRandCodeImage() {\n");
      out.write("    var date = new Date();\n");
      out.write("    var img = document.getElementById(\"randCodeImage\");\n");
      out.write("    img.src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/randCodeImage?a=' + date.getTime();\n");
      out.write("}\n");
      out.write("\n");
      out.write("  function darkStyle(){\n");
      out.write("    $('body').attr('class', 'login-layout');\n");
      out.write("    $('#id-text2').attr('class', 'red');\n");
      out.write("    $('#id-company-text').attr('class', 'blue');\n");
      out.write("    e.preventDefault();\n");
      out.write("  }\n");
      out.write("  function lightStyle(){\n");
      out.write("    $('body').attr('class', 'login-layout light-login');\n");
      out.write("    $('#id-text2').attr('class', 'grey');\n");
      out.write("    $('#id-company-text').attr('class', 'blue');\n");
      out.write("\n");
      out.write("    e.preventDefault();\n");
      out.write("  }\n");
      out.write("  function blurStyle(){\n");
      out.write("    $('body').attr('class', 'login-layout blur-login');\n");
      out.write("    $('#id-text2').attr('class', 'white');\n");
      out.write("    $('#id-company-text').attr('class', 'light-blue');\n");
      out.write("\n");
      out.write("    e.preventDefault();\n");
      out.write("  }\n");
      out.write("//设置cookie\n");
      out.write("  function setCookie()\n");
      out.write("  {\n");
      out.write("\n");
      out.write("  \tif ($('#on_off').attr(\"checked\")) {\n");
      out.write("\n");
      out.write("  \t\t$(\"input[iscookie='true']\").each(function() {\n");
      out.write("  \t\t\t$.cookie(this.name, $(\"#\"+this.name).val(), \"/\",24);\n");
      out.write("  \t\t\t$.cookie(\"COOKIE_NAME\",\"true\", \"/\",24);\n");
      out.write("  \t\t});\n");
      out.write("  \t} else {\n");
      out.write("  \t\t$(\"input[iscookie='true']\").each(function() {\n");
      out.write("  \t\t\t$.cookie(this.name,null);\n");
      out.write("  \t\t\t$.cookie(\"COOKIE_NAME\",null);\n");
      out.write("  \t\t});\n");
      out.write("  \t}\n");
      out.write("  }\n");
      out.write("  //读取cookie\n");
      out.write("  function getCookie()\n");
      out.write("  {\n");
      out.write("  \tvar COOKIE_NAME=$.cookie(\"COOKIE_NAME\");\n");
      out.write("  \tif (COOKIE_NAME !=null) {\n");
      out.write("  \t\t$(\"input[iscookie='true']\").each(function() {\n");
      out.write("  \t\t\t$($(\"#\"+this.name).val( $.cookie(this.name)));\n");
      out.write("              if(\"admin\" == $.cookie(this.name)) {\n");
      out.write("                  $(\"#randCode\").focus();\n");
      out.write("              } else {\n");
      out.write("                  $(\"#password\").val(\"\");\n");
      out.write("                  $(\"#password\").focus();\n");
      out.write("              }\n");
      out.write("          });\n");
      out.write("  \t\t$(\"#on_off\").attr(\"checked\", true);\n");
      out.write("  \t\t$(\"#on_off\").val(\"1\");\n");
      out.write("  \t} \n");
      out.write("  \telse\n");
      out.write("  \t{\n");
      out.write("  \t\t$(\"#on_off\").attr(\"checked\", false);\n");
      out.write("  \t\t$(\"#on_off\").val(\"0\");\n");
      out.write("        $(\"#randCode\").focus();\n");
      out.write("  \t}\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
