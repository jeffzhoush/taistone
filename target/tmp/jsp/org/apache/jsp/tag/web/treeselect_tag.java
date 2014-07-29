package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class treeselect_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fns:getAdminPath", com.thinkgem.jeesite.common.config.Global.class, "getAdminPath", new Class[] {});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/views/include/taglib.jsp");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.String name;
  private java.lang.String value;
  private java.lang.String labelName;
  private java.lang.String labelValue;
  private java.lang.String title;
  private java.lang.String url;
  private java.lang.Boolean checked;
  private java.lang.String extId;
  private java.lang.Boolean notAllowSelectRoot;
  private java.lang.Boolean notAllowSelectParent;
  private java.lang.String module;
  private java.lang.Boolean selectScopeModule;
  private java.lang.Boolean allowClear;
  private java.lang.String cssClass;
  private java.lang.String cssStyle;
  private java.lang.String disabled;
  private java.lang.String nodesLevel;
  private java.lang.String nameLevel;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getLabelName() {
    return this.labelName;
  }

  public void setLabelName(java.lang.String labelName) {
    this.labelName = labelName;
  }

  public java.lang.String getLabelValue() {
    return this.labelValue;
  }

  public void setLabelValue(java.lang.String labelValue) {
    this.labelValue = labelValue;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public void setUrl(java.lang.String url) {
    this.url = url;
  }

  public java.lang.Boolean getChecked() {
    return this.checked;
  }

  public void setChecked(java.lang.Boolean checked) {
    this.checked = checked;
  }

  public java.lang.String getExtId() {
    return this.extId;
  }

  public void setExtId(java.lang.String extId) {
    this.extId = extId;
  }

  public java.lang.Boolean getNotAllowSelectRoot() {
    return this.notAllowSelectRoot;
  }

  public void setNotAllowSelectRoot(java.lang.Boolean notAllowSelectRoot) {
    this.notAllowSelectRoot = notAllowSelectRoot;
  }

  public java.lang.Boolean getNotAllowSelectParent() {
    return this.notAllowSelectParent;
  }

  public void setNotAllowSelectParent(java.lang.Boolean notAllowSelectParent) {
    this.notAllowSelectParent = notAllowSelectParent;
  }

  public java.lang.String getModule() {
    return this.module;
  }

  public void setModule(java.lang.String module) {
    this.module = module;
  }

  public java.lang.Boolean getSelectScopeModule() {
    return this.selectScopeModule;
  }

  public void setSelectScopeModule(java.lang.Boolean selectScopeModule) {
    this.selectScopeModule = selectScopeModule;
  }

  public java.lang.Boolean getAllowClear() {
    return this.allowClear;
  }

  public void setAllowClear(java.lang.Boolean allowClear) {
    this.allowClear = allowClear;
  }

  public java.lang.String getCssClass() {
    return this.cssClass;
  }

  public void setCssClass(java.lang.String cssClass) {
    this.cssClass = cssClass;
  }

  public java.lang.String getCssStyle() {
    return this.cssStyle;
  }

  public void setCssStyle(java.lang.String cssStyle) {
    this.cssStyle = cssStyle;
  }

  public java.lang.String getDisabled() {
    return this.disabled;
  }

  public void setDisabled(java.lang.String disabled) {
    this.disabled = disabled;
  }

  public java.lang.String getNodesLevel() {
    return this.nodesLevel;
  }

  public void setNodesLevel(java.lang.String nodesLevel) {
    this.nodesLevel = nodesLevel;
  }

  public java.lang.String getNameLevel() {
    return this.nameLevel;
  }

  public void setNameLevel(java.lang.String nameLevel) {
    this.nameLevel = nameLevel;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getId() != null ) {
      _jspx_page_context.setAttribute("id", getId());
}
    if( getName() != null ) {
      _jspx_page_context.setAttribute("name", getName());
}
    if( getValue() != null ) {
      _jspx_page_context.setAttribute("value", getValue());
}
    if( getLabelName() != null ) {
      _jspx_page_context.setAttribute("labelName", getLabelName());
}
    if( getLabelValue() != null ) {
      _jspx_page_context.setAttribute("labelValue", getLabelValue());
}
    if( getTitle() != null ) {
      _jspx_page_context.setAttribute("title", getTitle());
}
    if( getUrl() != null ) {
      _jspx_page_context.setAttribute("url", getUrl());
}
    if( getChecked() != null ) {
      _jspx_page_context.setAttribute("checked", getChecked());
}
    if( getExtId() != null ) {
      _jspx_page_context.setAttribute("extId", getExtId());
}
    if( getNotAllowSelectRoot() != null ) {
      _jspx_page_context.setAttribute("notAllowSelectRoot", getNotAllowSelectRoot());
}
    if( getNotAllowSelectParent() != null ) {
      _jspx_page_context.setAttribute("notAllowSelectParent", getNotAllowSelectParent());
}
    if( getModule() != null ) {
      _jspx_page_context.setAttribute("module", getModule());
}
    if( getSelectScopeModule() != null ) {
      _jspx_page_context.setAttribute("selectScopeModule", getSelectScopeModule());
}
    if( getAllowClear() != null ) {
      _jspx_page_context.setAttribute("allowClear", getAllowClear());
}
    if( getCssClass() != null ) {
      _jspx_page_context.setAttribute("cssClass", getCssClass());
}
    if( getCssStyle() != null ) {
      _jspx_page_context.setAttribute("cssStyle", getCssStyle());
}
    if( getDisabled() != null ) {
      _jspx_page_context.setAttribute("disabled", getDisabled());
}
    if( getNodesLevel() != null ) {
      _jspx_page_context.setAttribute("nodesLevel", getNodesLevel());
}
    if( getNameLevel() != null ) {
      _jspx_page_context.setAttribute("nameLevel", getNameLevel());
}

    try {
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"input-append\">\r\n");
      out.write("\t<input id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Id\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cssClass}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write('"');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disabled eq 'true' ? ' disabled=\\'disabled\\'' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/>\r\n");
      out.write("\t<input id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Name\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${labelName}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" readonly=\"readonly\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${labelValue}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" maxlength=\"50\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disabled eq \"true\"? \" disabled=\\\"disabled\\\"\":\"\"}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"\r\n");
      out.write("\t\tclass=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cssClass}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cssStyle}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"/><a id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Button\" href=\"javascript:\" class=\"btn");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disabled eq 'true' ? ' disabled' : ''}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"><i class=\"icon-search\"></i></a>&nbsp;&nbsp;\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Button\").click(function(){\r\n");
      out.write("\t\t// 是否限制选择，如果限制，设置为disabled\r\n");
      out.write("\t\tif ($(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Id\").attr(\"disabled\")){\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("        var nameLevel = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nameLevel eq null ? \"1\" : nameLevel}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write(";\r\n");
      out.write("\t\t// 正常打开\t\r\n");
      out.write("\t\ttop.$.jBox.open(\"iframe:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/tag/treeselect?url=\"+encodeURIComponent(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${url}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\")+\"&module=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("&checked=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("&extId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${extId}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("&nodesLevel=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nodesLevel}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("&selectIds=\"+$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Id\").val(), \"选择");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\", 300, 420, {\r\n");
      out.write("\t\t\tbuttons:{\"确定\":\"ok\", ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allowClear?\"\\\"清除\\\":\\\"clear\\\", \":\"\"}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"关闭\":true}, submit:function(v, h, f){\r\n");
      out.write("\t\t\t\tif (v==\"ok\"){\r\n");
      out.write("\t\t\t\t\tvar tree = h.find(\"iframe\")[0].contentWindow.tree;//h.find(\"iframe\").contents();\r\n");
      out.write("\t\t\t\t\tvar ids = [], names = [], nodes = [];\r\n");
      out.write("\t\t\t\t\tif (\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" == \"true\"){\r\n");
      out.write("\t\t\t\t\t\tnodes = tree.getCheckedNodes(true);\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tnodes = tree.getSelectedNodes();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tfor(var i=0; i<nodes.length; i++) {//");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\tids.push(nodes[i].id);\r\n");
      out.write("                        var t_node = nodes[i];\r\n");
      out.write("                        var t_name = \"\";\r\n");
      out.write("                        var name_l = 0;\r\n");
      out.write("                        do{\r\n");
      out.write("                            name_l++;\r\n");
      out.write("                            t_name = t_node.name + \" \" + t_name;\r\n");
      out.write("                            t_node = t_node.getParentNode();\r\n");
      out.write("                        }while(name_l < nameLevel);\r\n");
      out.write("\t\t\t\t\t\tnames.push(t_name);//");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Id\").val(ids);\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("Name\").val(names);\r\n");
      out.write("\t\t\t\t}//");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t}, loaded:function(h){\r\n");
      out.write("\t\t\t\t$(\".jbox-content\", top.document).css(\"overflow-y\",\"hidden\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}${fns:getAdminPath()}", java.lang.Object.class, (PageContext)this.getJspContext(), _jspx_fnmap_0));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("ctxStatic");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/static", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${checked}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tif (nodes[i].isParent){\r\n");
        out.write("\t\t\t\t\t\t\tcontinue; // 如果为复选框选择，则过滤掉父节点\r\n");
        out.write("\t\t\t\t\t\t}//");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notAllowSelectRoot}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tif (nodes[i].level == 0){\r\n");
        out.write("\t\t\t\t\t\t\ttop.$.jBox.tip(\"不能选择根节点（\"+nodes[i].name+\"）请重新选择。\");\r\n");
        out.write("\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t}//");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${notAllowSelectParent}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tif (nodes[i].isParent){\r\n");
        out.write("\t\t\t\t\t\t\ttop.$.jBox.tip(\"不能选择父节点（\"+nodes[i].name+\"）请重新选择。\");\r\n");
        out.write("\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t}//");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty module && selectScopeModule}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tif (nodes[i].module == \"\"){\r\n");
        out.write("\t\t\t\t\t\t\ttop.$.jBox.tip(\"不能选择公共模型（\"+nodes[i].name+\"）请重新选择。\");\r\n");
        out.write("\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t}else if (nodes[i].module != \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${module}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\"){\r\n");
        out.write("\t\t\t\t\t\t\ttop.$.jBox.tip(\"不能选择当前栏目以外的栏目模型，请重新选择。\");\r\n");
        out.write("\t\t\t\t\t\t\treturn false;\r\n");
        out.write("\t\t\t\t\t\t}//");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!checked}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tbreak; // 如果为非复选框选择，则返回第一个选择  ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allowClear}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\telse if (v==\"clear\"){\r\n");
        out.write("\t\t\t\t\t$(\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Id\").val(\"\");\r\n");
        out.write("\t\t\t\t\t$(\"#");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Name\").val(\"\");\r\n");
        out.write("                }//");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
