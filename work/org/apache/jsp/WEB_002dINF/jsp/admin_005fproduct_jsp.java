/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.26
 * Generated at: 2023-03-21 02:27:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty;

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
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty.release();
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
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.dataTables.min.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"icon\" href=\"images/paw-print-clip-art-heart.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc/admin_nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("dark", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("product", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-3 col-12\">\r\n");
      out.write("            <div class=\"list-group m-4 style=\"background-color: #e3edfd;\">\r\n");
      out.write("                <a href=\"adminAllItemPath.do\" class=\"list-group-item list-group-item-action active\"><i class=\"fa fa-shopping-basket me-1\" style=\"color: #fa645e;\"></i>Product Management</a>\r\n");
      out.write("                <a href=\"adminAllCategoryPath.do\" class=\"list-group-item list-group-item-action\" aria-current=\"true\"><i class=\"fa fa-cubes me-1\" style=\"color: #fa645e;\"></i>Category Management</a>\r\n");
      out.write("                <a href=\"adminAllPetPath.do\" class=\"list-group-item list-group-item-action\"><i class=\"fa fa-paw me-2\" style=\"color: #fa645e;\"></i>Pet Management</a>\r\n");
      out.write("                <a href=\"adminAllCustomerPath.do\" class=\"list-group-item list-group-item-action\"><i class=\"fa fa-users me-1\" style=\"color: #fa645e;\"></i>User Management</a>\r\n");
      out.write("                <a href=\"adminAllOrderPath.do\" class=\"list-group-item list-group-item-action\"><i class=\"fa fa-truck me-1\" style=\"color: #fa645e;\"></i>Order Management</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-9 col-12 m-0 pt-3\">\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("            <!-- <div class=\"position-relative\">\r\n");
      out.write("              <div class=\"position-absolute end-0 top-0\">\r\n");
      out.write("                <form class=\"input-group\">\r\n");
      out.write("                  <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                  <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("          <div class=\"row ms-md-0 ms-3\">\r\n");
      out.write("              <div class=\"col-7\">\r\n");
      out.write("                  <h2 class=\"d-inline-flex\">All Products</h2>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-5\">\r\n");
      out.write("                  <div class=\"d-inline-flex float-end me-3\">\r\n");
      out.write("                      <a href=\"adminItemAddPathFirst.do\" type=\"button\" class=\"btn btn-info mb-3 text-white\"><i class=\"fa fa-plus me-1\" style=\"color: #fcfcfc;\"></i>Add New Product</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("          <div class=\"item-table-container w-100\"> \r\n");
      out.write("            <table class=\"table table-striped display pt-3\" id=\"table\">\r\n");
      out.write("              <thead class=\"\" style=\"background-color: #e3edfd;\">\r\n");
      out.write("              \t<tr class=\"thead\">\r\n");
      out.write("              \t  <th></th>\r\n");
      out.write("                  <th class=\"item-name text-center\">Item</th>\r\n");
      out.write("                  <th class=\"text-center\">Stock</th>\r\n");
      out.write("                  <th class=\"unit-price text-center\">Unit Price</th>\r\n");
      out.write("                  <th class=\"item-description text-center\">Description</th>\r\n");
      out.write("                  <th></th>\r\n");
      out.write("                  <th></th>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("              \t");
      //  logic:notEmpty
      org.apache.struts.taglib.logic.NotEmptyTag _jspx_th_logic_005fnotEmpty_005f0 = (org.apache.struts.taglib.logic.NotEmptyTag) _005fjspx_005ftagPool_005flogic_005fnotEmpty_0026_005fproperty_005fname.get(org.apache.struts.taglib.logic.NotEmptyTag.class);
      _jspx_th_logic_005fnotEmpty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_logic_005fnotEmpty_005f0.setParent(null);
      // /WEB-INF/jsp/admin_product.jsp(65,15) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f0.setProperty("itemsList");
      // /WEB-INF/jsp/admin_product.jsp(65,15) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_logic_005fnotEmpty_005f0.setName("AdminItemFormBean");
      int _jspx_eval_logic_005fnotEmpty_005f0 = _jspx_th_logic_005fnotEmpty_005f0.doStartTag();
      if (_jspx_eval_logic_005fnotEmpty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fproperty_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEmpty_005f0);
          // /WEB-INF/jsp/admin_product.jsp(66,5) name = id type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setId("item");
          // /WEB-INF/jsp/admin_product.jsp(66,5) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setProperty("itemsList");
          // /WEB-INF/jsp/admin_product.jsp(66,5) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_logic_005fiterate_005f0.setName("AdminItemFormBean");
          int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
          if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object item = null;
            if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_005fiterate_005f0.doInitBody();
            }
            item = (java.lang.Object) _jspx_page_context.findAttribute("item");
            do {
              out.write("\r\n");
              out.write("                \t\t<tr>\r\n");
              out.write("                  \t\t\t<td class=\"text-center\">\r\n");
              out.write("                    \t\t\t<div class=\"img-container\">\r\n");
              out.write("                      \t\t\t\t<img src=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemImage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" alt=\"productImage\" height=\"100\" width=\"100\" />\r\n");
              out.write("                    \t\t\t</div> \r\n");
              out.write("                  \t\t\t</td>\r\n");
              out.write("                  \t\t\t<td class=\"item-name\"> ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.itemName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                  \t\t\t<td class=\"text-center\"> ");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.stock }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                  \t\t\t<td class=\"unit-price text-center\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.unitPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(" ks</td>\r\n");
              out.write("                  \t\t\t<td class=\"item-description\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.description }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(" </td>\r\n");
              out.write("                  \t\t\t<td class=\"text-center\"><a href=\"adminItemEditPathFirst.do?frmItemId=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\"><i class=\"fa fa-pencil me-1\" style=\"color: #fa645e;\"></i></a></td>\r\n");
              out.write("                \t\t\t<td>");
              if (_jspx_meth_html_005fhidden_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<a data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-trash me-1\"></i></a>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<!-- Modal -->\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal fade\" id=\"exampleModal");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" tabindex=\"-1\"\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-dialog\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-content\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">Are you sure to detete?</h5>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn-close\"\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");
              if (_jspx_meth_html_005fform_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("                \t\t\r\n");
              out.write("                \t\t\r\n");
              out.write("                \t\t</tr> \r\n");
              out.write("  \t\t\t\t \t");
              int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
              item = (java.lang.Object) _jspx_page_context.findAttribute("item");
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
          out.write("  \t\t\t  \t");
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
      out.write("     \r\n");
      out.write("              </tbody> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            </table>\r\n");
      out.write("        </div> \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"js/AutoComplement.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(\r\n");
      out.write("                function() {\r\n");
      out.write("                    var dataSrc = [];\r\n");
      out.write("\r\n");
      out.write("                    var table = $('#table').DataTable({\r\n");
      out.write("                        'initComplete' : function() {\r\n");
      out.write("                            var api = this.api();\r\n");
      out.write("\r\n");
      out.write("                            // Populate a dataset for autocomplete functionality\r\n");
      out.write("                            // using data from first, second and third columns\r\n");
      out.write("                            api.cells('tr', [ 1 ]).every(function() {\r\n");
      out.write("                                // Get cell data as plain text\r\n");
      out.write("                                var data = $('<div>').html(this.data()).text();\r\n");
      out.write("                                if (dataSrc.indexOf(data) === -1) {\r\n");
      out.write("                                    dataSrc.push(data);\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            // Sort dataset alphabetically\r\n");
      out.write("                            dataSrc.sort();\r\n");
      out.write("                            // Initialize Typeahead plug-in\r\n");
      out.write("                            $('.dataTables_filter input[type=\"search\"]',\r\n");
      out.write("                                    api.table().container()).typeahead({\r\n");
      out.write("                                source : dataSrc,\r\n");
      out.write("                                afterSelect : function(value) {\r\n");
      out.write("                                    api.search(value).draw();\r\n");
      out.write("                                }\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            $('.dataTables_filter input[type=\"search\"]').on('keyup', function() {\r\n");
      out.write("                                 console.log('event')\r\n");
      out.write("                                 $('#table').DataTable().column(1).search(this.value).draw();\r\n");
      out.write("                                 });\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("        /*         $(document).ready(function() {\r\n");
      out.write("         $(\"#ctable\").DataTable();\r\n");
      out.write("\r\n");
      out.write("         $('.dataTables_filter input').off().on('keyup', function() {\r\n");
      out.write("         console.log('event')\r\n");
      out.write("         $('#ctable').DataTable().column(0).search(this.value).draw();\r\n");
      out.write("         });\r\n");
      out.write("         });  */\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /WEB-INF/jsp/admin_product.jsp(78,23) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setProperty("frmItemId");
    // /WEB-INF/jsp/admin_product.jsp(78,23) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    // /WEB-INF/jsp/admin_product.jsp(94,15) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fform_005f0.setAction("/adminAllItemPath");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-outline-danger\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata-bs-dismiss=\"modal\">Cancel</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t   ");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /WEB-INF/jsp/admin_product.jsp(97,13) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setProperty("frmItemId");
    // /WEB-INF/jsp/admin_product.jsp(97,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fhidden_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    // /WEB-INF/jsp/admin_product.jsp(98,13) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setProperty("btnDelete");
    // /WEB-INF/jsp/admin_product.jsp(98,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setValue("Delete");
    // /WEB-INF/jsp/admin_product.jsp(98,13) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_html_005fsubmit_005f0.setStyleClass("btn btn-red");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fstyleClass_005fproperty.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }
}
