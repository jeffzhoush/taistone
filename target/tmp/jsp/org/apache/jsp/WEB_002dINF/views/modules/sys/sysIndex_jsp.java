package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sysIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_3;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_4;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_5;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_6;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getConfig", com.thinkgem.jeesite.common.config.Global.class, "getConfig", new Class[] {java.lang.String.class});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getMenuList", com.thinkgem.jeesite.modules.sys.utils.UserUtils.class, "getMenuList", new Class[] {});
  _jspx_fnmap_3= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_3.mapFunction("fnc:getSite", com.thinkgem.jeesite.modules.cms.utils.CmsUtils.class, "getSite", new Class[] {java.lang.String.class});
  _jspx_fnmap_3.mapFunction("fnc:getCurrentSiteId", com.thinkgem.jeesite.modules.cms.entity.Site.class, "getCurrentSiteId", new Class[] {});
  _jspx_fnmap_4= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fnc:getSiteList", com.thinkgem.jeesite.modules.cms.utils.CmsUtils.class, "getSiteList", new Class[] {});
  _jspx_fnmap_5= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getFrontPath", com.thinkgem.jeesite.common.config.Global.class, "getFrontPath", new Class[] {});
  _jspx_fnmap_6= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getDictList", com.thinkgem.jeesite.modules.sys.utils.DictUtils.class, "getDictList", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/dialog.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_hasPermission_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_property_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_hasPermission_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_shiro_principal_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_shiro_hasPermission_name.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_shiro_principal_property_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('productName')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("</title>\r\n");
      out.write("\t");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-jbox/2.3/Skins/Bootstrap/jbox.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-jbox/2.3/jquery.jBox-2.3.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-jbox/2.3/i18n/jquery.jBox-zh-CN.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("\t<meta name=\"decorator\" content=\"default\"/>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t#main {padding:0;margin:0;} #main .container-fluid{padding:0 7px 0 10px;}\r\n");
      out.write("\t\t#header {margin:0 0 10px;position:static;} #header li {font-size:14px;_font-size:12px;}\r\n");
      out.write("\t\t#header .brand {font-family:Helvetica, Georgia, Arial, sans-serif, 黑体;font-size:26px;padding-left:33px;}\r\n");
      out.write("\t\t#footer {margin:8px 0 0 0;padding:3px 0 0 0;font-size:11px;text-align:center;border-top:2px solid #0663A2;}\r\n");
      out.write("\t\t#footer, #footer a {color:#999;} \r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\"> \r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#menu a.menu\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#menu li.menu\").removeClass(\"active\");\r\n");
      out.write("\t\t\t\t$(this).parent().addClass(\"active\");\r\n");
      out.write("\t\t\t\tif(!$(\"#openClose\").hasClass(\"close\")){\r\n");
      out.write("\t\t\t\t\t$(\"#openClose\").click();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"header\" class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t      <div class=\"navbar-inner\">\r\n");
      out.write("\t      \t <div class=\"brand\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('productName')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("</div>\r\n");
      out.write("\t         <div class=\"nav-collapse\">\r\n");
      out.write("\t           <ul id=\"menu\" class=\"nav\">\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_shiro_hasPermission_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t           </ul>\r\n");
      out.write("\t           <ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getFrontPath()}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_5));
      out.write("/index-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fnc:getCurrentSiteId()}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_3));
      out.write(".html\" target=\"_blank\" title=\"访问网站主页\"><i class=\"icon-home\"></i></a></li>\r\n");
      out.write("\t\t\t  \t <li id=\"themeSwitch\" class=\"dropdown\">\r\n");
      out.write("\t\t\t       \t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" title=\"主题切换\"><i class=\"icon-th-large\"></i></a>\r\n");
      out.write("\t\t\t\t    <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t      ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t\t    <!--[if lte IE 6]><script type=\"text/javascript\">$('#themeSwitch').hide();</script><![endif]-->\r\n");
      out.write("\t\t\t     </li>\r\n");
      out.write("\t\t\t  \t <li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" title=\"个人信息\">您好, ");
      if (_jspx_meth_shiro_principal_0(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("\t\t\t\t    <ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t      <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/user/info\" target=\"mainFrame\"><i class=\"icon-user\"></i>&nbsp; 个人信息</a></li>\r\n");
      out.write("\t\t\t\t      <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/user/modifyPwd\" target=\"mainFrame\"><i class=\"icon-lock\"></i>&nbsp;  修改密码</a></li>\r\n");
      out.write("\t\t\t\t    </ul>\r\n");
      out.write("\t\t\t  \t </li>\r\n");
      out.write("\t\t\t  \t <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" title=\"退出登录\">退出</a></li>\r\n");
      out.write("\t\t\t  \t <li>&nbsp;</li>\r\n");
      out.write("\t           </ul>\r\n");
      out.write("\t         </div><!--/.nav-collapse -->\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div id=\"content\" class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div id=\"left\">\r\n");
      out.write("\t\t\t\t\t<iframe id=\"menuFrame\" name=\"menuFrame\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/menu/tree?parentId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstMenuId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"overflow:visible;\"\r\n");
      out.write("\t\t\t\t\t\tscrolling=\"yes\" frameborder=\"no\" width=\"100%\" height=\"650\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"openClose\" class=\"close\">&nbsp;</div>\r\n");
      out.write("\t\t\t\t<div id=\"right\">\r\n");
      out.write("\t\t\t\t\t<iframe id=\"mainFrame\" name=\"mainFrame\" src=\"\" style=\"overflow:visible;\"\r\n");
      out.write("\t\t\t\t\t\tscrolling=\"yes\" frameborder=\"no\" width=\"100%\" height=\"650\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t    <div id=\"footer\" class=\"row-fluid\">\r\n");
      out.write("\t            Copyright &copy; 2012-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('copyrightYear')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('productName')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write(" - Powered By <a href=\"https://github.com/thinkgem/jeesite\" target=\"_blank\">JeeSite</a> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getConfig('version')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\"> \r\n");
      out.write("\t\tvar leftWidth = \"160\"; // 左侧窗口大小\r\n");
      out.write("\t\tfunction wSize(){\r\n");
      out.write("\t\t\tvar minHeight = 500, minWidth = 980;\r\n");
      out.write("\t\t\tvar strs=getWindowSize().toString().split(\",\");\r\n");
      out.write("\t\t\t$(\"#menuFrame, #mainFrame, #openClose\").height((strs[0]<minHeight?minHeight:strs[0])-$(\"#header\").height()-$(\"#footer\").height()-32);\r\n");
      out.write("\t\t\t$(\"#openClose\").height($(\"#openClose\").height()-5);\r\n");
      out.write("\t\t\tif(strs[1]<minWidth){\r\n");
      out.write("\t\t\t\t$(\"#main\").css(\"width\",minWidth-10);\r\n");
      out.write("\t\t\t\t$(\"html,body\").css({\"overflow\":\"auto\",\"overflow-x\":\"auto\",\"overflow-y\":\"auto\"});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#main\").css(\"width\",\"auto\");\r\n");
      out.write("\t\t\t\t$(\"html,body\").css({\"overflow\":\"hidden\",\"overflow-x\":\"hidden\",\"overflow-y\":\"hidden\"});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#right\").width($(\"#content\").width()-$(\"#left\").width()-$(\"#openClose\").width()-5);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/wsize.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctxStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("firstMenu");
    _jspx_th_c_set_2.setValue(new String("true"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getMenuList()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_2));
    _jspx_th_c_forEach_0.setVar("menu");
    _jspx_th_c_forEach_0.setVarStatus("idxStatus");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.parent.id eq '1' && menu.isShow eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<li class=\"menu ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstMenu ? ' active' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><a class=\"menu\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/sys/menu/tree?parentId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" target=\"menuFrame\" >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstMenu}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_3.setVar("firstMenuId");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_4.setVar("firstMenu");
    _jspx_th_c_set_4.setValue(new String("false"));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_shiro_hasPermission_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_hasPermission_0 = (org.apache.shiro.web.tags.HasPermissionTag) _jspx_tagPool_shiro_hasPermission_name.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_hasPermission_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_hasPermission_0.setParent(null);
    _jspx_th_shiro_hasPermission_0.setName("cms:site:select");
    int _jspx_eval_shiro_hasPermission_0 = _jspx_th_shiro_hasPermission_0.doStartTag();
    if (_jspx_eval_shiro_hasPermission_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li class=\"dropdown\">\r\n");
        out.write("\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fnc:getSite(fnc:getCurrentSiteId()).name}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_3));
        out.write("<b class=\"caret\"></b></a>\r\n");
        out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_shiro_hasPermission_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t ");
        int evalDoAfterBody = _jspx_th_shiro_hasPermission_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_hasPermission_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
      return true;
    }
    _jspx_tagPool_shiro_hasPermission_name.reuse(_jspx_th_shiro_hasPermission_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_hasPermission_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_hasPermission_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fnc:getSiteList()}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_4));
    _jspx_th_c_forEach_1.setVar("site");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/cms/site/select?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${site.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&flag=1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${site.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fns:getDictList('theme')}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_6));
    _jspx_th_c_forEach_2.setVar("dict");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li><a href=\"#\" onclick=\"location='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/theme/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dict.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("?url='+location.href\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dict.label}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_shiro_principal_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_property_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent(null);
    _jspx_th_shiro_principal_0.setProperty("name");
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_property_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }
}
