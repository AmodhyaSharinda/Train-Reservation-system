/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-08 16:41:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1728372531280L));
    _jspx_dependants.put("jar:file:/E:/projects/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Train%20reserve/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Account - Online Train Reservation System</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"home.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Importing Google font - Open Sans */\r\n");
      out.write("        @import url(\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;500;600;700&display=swap\");\r\n");
      out.write("\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            font-family: \"Open Sans\", sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 0 10px;\r\n");
      out.write("            background: linear-gradient(to bottom, #175d69 23%, #330c43 95%);\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            z-index: 1; /* Ensure header is on top */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            max-width: 1200px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            padding: 20px 15px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .logo a {\r\n");
      out.write("            font-size: 1.8rem;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .links {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("            gap: 35px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .links a {\r\n");
      out.write("            font-weight: 500;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 10px 0;\r\n");
      out.write("            transition: 0.2s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .links a:hover {\r\n");
      out.write("            color: #47b2e4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .buttons a {\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-size: 1rem;\r\n");
      out.write("            padding: 15px 0;\r\n");
      out.write("            transition: 0.2s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .buttons a:not(:last-child) {\r\n");
      out.write("            margin-right: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .buttons .signin:hover {\r\n");
      out.write("            color: #47b2e4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .buttons .signup {\r\n");
      out.write("            border: 1px solid #fff;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border-radius: 0.375rem;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            transition: 0.2s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .navbar .buttons .signup:hover {\r\n");
      out.write("            background-color: #47b2e4;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .wrapper {\r\n");
      out.write("            width: 450px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.5);\r\n");
      out.write("            backdrop-filter: blur(8px);\r\n");
      out.write("            -webkit-backdrop-filter: blur(8px);\r\n");
      out.write("            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            font-size: 2rem;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .detail {\r\n");
      out.write("            margin: 15px 0;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-size: 1.2rem;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.1);\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .detail:hover {\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .edit-button {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            color: #000;\r\n");
      out.write("            font-weight: 600;\r\n");
      out.write("            border: none;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            transition: 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .edit-button:hover {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            background: rgba(255, 255, 255, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header class=\"header\">\r\n");
      out.write("        <nav class=\"navbar\">\r\n");
      out.write("            <h2 class=\"logo\"><a href=\"#\">ExpressReserve</a></h2>\r\n");
      out.write("            <ul class=\"links\">\r\n");
      out.write("                <li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">Services</a></li>\r\n");
      out.write("                <li><a href=\"#\">Book Now</a></li>\r\n");
      out.write("                <li><a href=\"ContactUs.jsp\">FeedBack</a></li>\r\n");
      out.write("                <li><a href=\"account.html\">Account</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"buttons\">\r\n");
      out.write("	          <a href=\"login.jsp\" class=\"signup\">Sign In</a>\r\n");
      out.write("	          <a href=\"AdminLogin.jsp\" class=\"signup\">Admin</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <h2>Your Account Details</h2>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"Logout\" method=\"get\">\r\n");
      out.write("		    <button class=\"edit-button\" type=\"submit\" class=\"logout-button\">Logout</button>\r\n");
      out.write("		</form>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /Account.jsp(176,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cus");
      // /Account.jsp(176,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/Account.jsp(176,8) '${custDetails}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${custDetails}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("            <div class=\"detail\">Name: <span id=\"customerName\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></div>\r\n");
            out.write("            <div class=\"detail\">Email: <span id=\"customerEmail\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></div>\r\n");
            out.write("            <div class=\"detail\">Phone: <span id=\"customerPhone\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></div>\r\n");
            out.write("            <div class=\"detail\">Username: <span id=\"customerUsername\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cus.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></div>\r\n");
            out.write("        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
