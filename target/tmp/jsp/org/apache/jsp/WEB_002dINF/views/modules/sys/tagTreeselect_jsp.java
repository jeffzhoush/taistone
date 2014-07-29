package org.apache.jsp.WEB_002dINF.views.modules.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tagTreeselect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:indexOf", org.apache.taglibs.standard.functions.Functions.class, "indexOf", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/head.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/treeview.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html style=\"overflow-x:hidden;overflow-y:auto;\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>数据选择</title>\r\n");
      out.write("\t");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\" /><meta http-equiv=\"Pragma\" content=\"no-cache\" /><meta http-equiv=\"Expires\" content=\"0\" />\r\n");
      out.write("<meta name=\"author\" content=\"http://thinkgem.iteye.com\"/><meta http-equiv=\"X-UA-Compatible\" content=\"IE=7,IE=9,IE=10\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery/jquery-migrate-1.1.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.11.1/jquery.validate.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.11.1/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-validation/1.11.1/jquery.validate.method.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/2.3.1/css_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty cookie.theme.value ? cookie.theme.value:'default'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/2.3.1/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--[if lte IE 6]><link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/bsie/css/bootstrap-ie6.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/bootstrap/bsie/js/bootstrap-ie.min.js\" type=\"text/javascript\"></script><![endif]-->\r\n");
      out.write("<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("<!--[if lt IE 9]> <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/html5.js\"></script><![endif]-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/My97DatePicker/WdatePicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/mustache.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/list/list.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/select2/select2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/select2/select2_locale_zh-CN.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/select2/select2.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/x-editable/css/bootstrap-editable.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/x-editable/js/bootstrap-editable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fancyBox/source/jquery.fancybox.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fancyBox/source/jquery.fancybox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/common/jeesite.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favicon.ico\">");
      out.write("\r\n");
      out.write("\t");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-ztree/3.5.12/css/zTreeStyle/zTreeStyle.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-ztree/3.5.12/js/jquery.ztree.core-3.5.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctxStatic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/jquery-ztree/3.5.12/js/jquery.ztree.excheck-3.5.min.js\" type=\"text/javascript\"></script>");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar key, lastValue = \"\", nodeList = [];\r\n");
      out.write("\t\tvar tree, setting = {view:{selectedMulti:false},check:{enable:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\",nocheckInherit:true},\r\n");
      out.write("\t\t\t\tdata:{simpleData:{enable:true}},\r\n");
      out.write("\t\t\t\tview:{\r\n");
      out.write("\t\t\t\t\tfontCss:function(treeId, treeNode) {\r\n");
      out.write("\t\t\t\t\t\treturn (!!treeNode.highlight) ? {\"font-weight\":\"bold\"} : {\"font-weight\":\"normal\"};\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcallback:{beforeClick:function(id, node){\r\n");
      out.write("\t\t\t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" == \"true\"){\r\n");
      out.write("\t\t\t\t\t\ttree.checkNode(node, !node.checked, true, true);\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}, \r\n");
      out.write("\t\t\t\tonDblClick:function(){\r\n");
      out.write("\t\t\t\t\ttop.$.jBox.getBox().find(\"button[value='ok']\").trigger(\"click\");\r\n");
      out.write("\t\t\t\t\t//alert($(\"input[type='text']\", top.mainFrame.document).val());\r\n");
      out.write("\t\t\t\t\t//$(\"input[type='text']\", top.mainFrame.document).focus();\r\n");
      out.write("\t\t\t\t}}};\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$.get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:indexOf(url,'?')==-1?'?':'&'}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1));
      out.write("&extId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${extId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&module=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&t=\"+new Date().getTime(), function(zNodes){\r\n");
      out.write("\t\t\t\t// 初始化树结构\r\n");
      out.write("\t\t\t\ttree = $.fn.zTree.init($(\"#tree\"), setting, zNodes);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// 默认展开一级节点\r\n");
      out.write("\t\t\t\tvar nodes = tree.getNodesByParam(\"level\", 0);\r\n");
      out.write("\t\t\t\tfor(var i=0; i<nodes.length; i++) {\r\n");
      out.write("\t\t\t\t\ttree.expandNode(nodes[i], true, false, false);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t// 默认选择节点\r\n");
      out.write("\t\t\t\tvar ids = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selectIds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\".split(\",\");\r\n");
      out.write("\t\t\t\tfor(var i=0; i<ids.length; i++) {\r\n");
      out.write("\t\t\t\t\tvar node = tree.getNodeByParam(\"id\", ids[i]);\r\n");
      out.write("\t\t\t\t\tif(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" == \"true\"){\r\n");
      out.write("\t\t\t\t\t\ttry{tree.checkNode(node, true, true);}catch(e){}\r\n");
      out.write("\t\t\t\t\t\ttree.selectNode(node, false);\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\ttree.selectNode(node, true);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tkey = $(\"#key\");\r\n");
      out.write("\t\t\tkey.bind(\"focus\", focusKey).bind(\"blur\", blurKey).bind(\"change keydown cut input propertychange\", searchNode);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  \tfunction focusKey(e) {\r\n");
      out.write("\t\t\tif (key.hasClass(\"empty\")) {\r\n");
      out.write("\t\t\t\tkey.removeClass(\"empty\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction blurKey(e) {\r\n");
      out.write("\t\t\tif (key.get(0).value === \"\") {\r\n");
      out.write("\t\t\t\tkey.addClass(\"empty\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tsearchNode(e);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction searchNode(e) {\r\n");
      out.write("\t\t\t// 取得输入的关键字的值\r\n");
      out.write("\t\t\tvar value = $.trim(key.get(0).value);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 按名字查询\r\n");
      out.write("\t\t\tvar keyType = \"name\";\r\n");
      out.write("\t\t\tif (key.hasClass(\"empty\")) {\r\n");
      out.write("\t\t\t\tvalue = \"\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 如果和上次一次，就退出不查了。\r\n");
      out.write("\t\t\tif (lastValue === value) {\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 保存最后一次\r\n");
      out.write("\t\t\tlastValue = value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 如果要查空字串，就退出不查了。\r\n");
      out.write("\t\t\tif (value === \"\") {\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tupdateNodes(false);\r\n");
      out.write("\t\t\tnodeList = tree.getNodesByParamFuzzy(keyType, value);\r\n");
      out.write("\t\t\tupdateNodes(true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction updateNodes(highlight) {\r\n");
      out.write("\t\t\tfor(var i=0, l=nodeList.length; i<l; i++) {\r\n");
      out.write("\t\t\t\tnodeList[i].highlight = highlight;\t\t\t\t\r\n");
      out.write("\t\t\t\ttree.updateNode(nodeList[i]);\r\n");
      out.write("\t\t\t\ttree.expandNode(nodeList[i].getParentNode(), true, false, false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction search() {\r\n");
      out.write("\t\t\t$(\"#search\").slideToggle(200);\r\n");
      out.write("\t\t\t$(\"#txt\").toggle();\r\n");
      out.write("\t\t\t$(\"#key\").focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"position:absolute;right:8px;top:5px;cursor:pointer;\" onclick=\"search();\">\r\n");
      out.write("\t\t<i class=\"icon-search\"></i><label id=\"txt\">搜索</label>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"search\" class=\"control-group hide\" style=\"padding:10px 0 0 15px;\">\r\n");
      out.write("\t\t<label for=\"key\" class=\"control-label\" style=\"float:left;padding:5px 5px 3px;\">关键字：</label>\r\n");
      out.write("\t\t<input type=\"text\" class=\"empty\" id=\"key\" name=\"key\" maxlength=\"50\" style=\"width:180px;\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"tree\" class=\"ztree\" style=\"padding:15px 20px;\"></div>\r\n");
      out.write("</body>");
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
}
