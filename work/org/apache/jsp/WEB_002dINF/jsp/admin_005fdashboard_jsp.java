/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2023-03-21 02:27:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/D:/ProjectWs/PettoSupplies/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-bean.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("jar:file:/D:/ProjectWs/PettoSupplies/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098687690000L));
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.8.jar", Long.valueOf(1679363862393L));
    _jspx_dependants.put("jar:file:/D:/ProjectWs/PettoSupplies/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1679363862344L));
    _jspx_dependants.put("/WEB-INF/jsp/inc/common.jsp", Long.valueOf(1679363861760L));
    _jspx_dependants.put("jar:file:/D:/ProjectWs/PettoSupplies/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-logic.tld", Long.valueOf(1172892492000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.release();
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Pet Needs - Admin</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/shared.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css1/admin_style.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"icon\" href=\"images/paw-print-clip-art-heart.ico\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/admin_nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("dark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("dashboard", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-3 col-12\">\r\n");
      out.write("\t\t\t<div class=\"list-group m-4\" style=\"background-color: #e3edfd;\">\r\n");
      out.write("\t\t\t\t<a href=\"adminAllItemPath.do\"\r\n");
      out.write("\t\t\t\t\tclass=\"list-group-item list-group-item-action\" aria-current=\"true\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-shopping-basket me-2\" style=\"color: #fa645e;\"></i>Product\r\n");
      out.write("\t\t\t\t\tManagement</a> <a href=\"adminAllCategoryPath.do\"\r\n");
      out.write("\t\t\t\t\tclass=\"list-group-item list-group-item-action\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-cubes me-1\" style=\"color: #fa645e;\"></i>Category\r\n");
      out.write("\t\t\t\t\tManagement</a> <a href=\"adminAllPetPath.do\"\r\n");
      out.write("\t\t\t\t\tclass=\"list-group-item list-group-item-action\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-paw me-2\" style=\"color: #fa645e;\"></i>Pet Management</a> <a\r\n");
      out.write("\t\t\t\t\thref=\"adminAllCustomerPath.do\"\r\n");
      out.write("\t\t\t\t\tclass=\"list-group-item list-group-item-action\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-users me-1\" style=\"color: #fa645e;\"></i>User\r\n");
      out.write("\t\t\t\t\tManagement</a> <a href=\"adminAllOrderPath.do\"\r\n");
      out.write("\t\t\t\t\tclass=\"list-group-item list-group-item-action\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-truck me-1\" style=\"color: #fa645e;\"></i>Order\r\n");
      out.write("\t\t\t\t\tManagement</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <div class=\"position-relative\">\r\n");
      out.write("              <div class=\"position-absolute end-0 top-0\">\r\n");
      out.write("                <form class=\"input-group\">\r\n");
      out.write("                  <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                  <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-9 col-12 pt-3\">\r\n");
      out.write("\t\t\t\t<h2 class=\"d-inline-flex ms-md-0 ms-3\">Admin Dashboard</h2>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"row me-2 ms-2 d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-lg-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card text-center shadow fw-bold\" style=\"height: 175px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-4 mt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-basket ms-4 mt-4 fa-3x text-success\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-3 text-success fw-bold\">Total Items</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"card-title fw-bold text-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AdminLoginFormBean.frmTotalProduct }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"adminAllItemPath.do\" class=\"text-decoration-none\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-footer text-muted\">View Detail >></div></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-lg-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card text-center shadow fw-bold\" style=\"height: 175px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-4 mt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-truck ms-4 mt-4 fa-3x text-primary\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-3 fw-bold text-primary\">Total Orders</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"card-title fw-bold text-primary\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AdminLoginFormBean.frmTotalOrder }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"adminAllOrderPath.do\" class=\"text-decoration-none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-footer text-muted\">View Detail >></div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-lg-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card text-center shadow fw-bold pt-3\" style=\"height: 175px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-3 mt-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-usd ms-4 mt-4 fa-3x text-warning\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-3 fw-bold text-warning\">Total Sales</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h2 class=\"card-title fw-bold text-warning\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AdminLoginFormBean.frmTotalSale }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-lg-6 col-sm-6 col-12 mb-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card text-center fw-bold shadow\" style=\"height: 175px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-3 mt-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-users ms-4 mt-4 fa-2x text-danger\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"mt-3 fw-bold text-danger\">Registered Users</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"card-title fw-bold text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${AdminLoginFormBean.frmTotalUser }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"adminAllCustomerPath.do\" class=\"text-decoration-none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-footer text-muted\">View Detail >></div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"item-table-container shadow px-4 py-2 rounded w-100\" style=\"background-color: #f3f8ff;\">\r\n");
      out.write("\t\t\t\t<h2>Recent Orders</h2>\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                \t<thead style=\"background-color: #e3edfd;\">\r\n");
      out.write("                \t\t<tr class=\"thead\">\r\n");
      out.write("                        \t<th>OrderCode</th>\r\n");
      out.write("                        \t<th>Customer</th>\r\n");
      out.write("                        \t<th>Qty</th>\r\n");
      out.write("                        \t<th>Price</th>\r\n");
      out.write("                        \t<th>Payment</th>\r\n");
      out.write("                        \t<th>OrderDate</th>\r\n");
      out.write("                        \t<th></th>\r\n");
      out.write("                        \t<th>Detail</th>\r\n");
      out.write("                    \t</tr>\r\n");
      out.write("                \t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("                    ");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEmpty_005f0.setParent(null);
      // /WEB-INF/jsp/admin_dashboard.jsp(152,20) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f0.setProperty("orderProcessingList");
      // /WEB-INF/jsp/admin_dashboard.jsp(152,20) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f0.setName("AdminLoginFormBean");
      int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
          // /WEB-INF/jsp/admin_dashboard.jsp(153,6) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setId("order");
          // /WEB-INF/jsp/admin_dashboard.jsp(153,6) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setProperty("orderProcessingList");
          // /WEB-INF/jsp/admin_dashboard.jsp(153,6) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setName("AdminLoginFormBean");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object order = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            order = (java.lang.Object) _jspx_page_context.findAttribute("order");
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t<tr>\r\n");
              out.write("                              <td>#");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                              <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.receiverName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                              <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.totalQty }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                              <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.totalPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(" ks</td>\r\n");
              out.write("                              <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.paymentType }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                              <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                              <td><a href=\"adminOrderConfirmPath.do?frmDetailOrderId=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" class=\"btn btn-sm btn-primary\">Confirm</a></td>\r\n");
              out.write("                              <td><a href=\"adminOrderDetailPath.do?frmDetailOrderId=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" class=\"btn btn-sm btn-outline-primary\">View Detail</a></td>\r\n");
              out.write("                            </tr>\r\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              order = (java.lang.Object) _jspx_page_context.findAttribute("order");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_005fnotEmpty_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_005fnotEmpty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
        return;
      }
      _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.reuse(_jspx_th_logic_005fnotEmpty_005f0);
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>  \r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("\t\t\t");
      out.write(" \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
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
