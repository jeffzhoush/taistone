package org.apache.jsp.WEB_002dINF.views.modules.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cmsTree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/views/include/treeview.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\t<title>栏目列表</title>\r\n");
      out.write("\t<meta name=\"decorator\" content=\"default\"/>\r\n");
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
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.ztree {overflow:auto;margin:0;_margin-top:10px;padding:10px 0 0 10px;}");
      out.write("\r\n");
      out.write("\t\t.accordion-inner{padding:2px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tvar setting = {view:{selectedMulti:false},data:{simpleData:{enable:true}}};\r\n");
      out.write("\t\t\tvar zNodes=[\r\n");
      out.write("\t\t            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("];\r\n");
      out.write("\t\t\tfor(var i=0; i<zNodes.length; i++) {\r\n");
      out.write("\t\t\t\t// 移除父节点\r\n");
      out.write("\t\t\t\tif (zNodes[i] && zNodes[i].id == 1){\r\n");
      out.write("\t\t\t\t\tzNodes.splice(i, 1);\r\n");
      out.write("\t\t\t\t}");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t// 初始化树结构\r\n");
      out.write("\t\t\tvar tree = $.fn.zTree.init($(\"#tree\"), setting, zNodes);\r\n");
      out.write("\t\t\t// 展开第一级节点\r\n");
      out.write("\t\t\tvar nodes = tree.getNodesByParam(\"level\", 0);\r\n");
      out.write("\t\t\tfor(var i=0; i<nodes.length; i++) {\r\n");
      out.write("\t\t\t\ttree.expandNode(nodes[i], true, true, false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t// 展开第二级节点\r\n");
      out.write("\t\t\tnodes = tree.getNodesByParam(\"level\", 1);\r\n");
      out.write("\t\t\tfor(var i=0; i<nodes.length; i++) {\r\n");
      out.write("\t\t\t\ttree.expandNode(nodes[i], true, true, false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\twSize();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(window).resize(function(){\r\n");
      out.write("\t\t\twSize();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction wSize(){\r\n");
      out.write("\t\t\t$(\".ztree\").width($(window).width()-16).height($(window).height()-62);\r\n");
      out.write("\t\t\t$(\".ztree\").css({\"overflow\":\"auto\",\"overflow-x\":\"auto\",\"overflow-y\":\"auto\"});\r\n");
      out.write("\t\t\t$(\"html,body\").css({\"overflow\":\"hidden\",\"overflow-x\":\"hidden\",\"overflow-y\":\"hidden\"});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"accordion-group\">\r\n");
      out.write("\t    <div class=\"accordion-heading\">\r\n");
      out.write("\t    \t<a class=\"accordion-toggle\">栏目列表</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"accordion-body\">\r\n");
      out.write("\t\t\t<div class=\"accordion-inner\">\r\n");
      out.write("\t\t\t\t<div id=\"tree\" class=\"ztree\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("tpl");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("{id:'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpl.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', pId:'");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty tpl.parent?tpl.parent.id:0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', name:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpl.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", url:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/cms/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty tpl.module?tpl.module:'none'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/?category.id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tpl.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", target:\"cmsMainFrame\"},\r\n");
          out.write("\t\t            ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
