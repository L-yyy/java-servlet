/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-12-23 05:56:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class brand_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .el-table .warning-row {\r\n");
      out.write("            background: oldlace;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .el-table .success-row {\r\n");
      out.write("            background: #f0f9eb;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"app\">\r\n");
      out.write("\r\n");
      out.write("    <!--搜索表单-->\r\n");
      out.write("    <el-form :inline=\"true\" :model=\"brand\" class=\"demo-form-inline\">\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"当前状态\">\r\n");
      out.write("            <el-select v-model=\"brand.status\" placeholder=\"当前状态\">\r\n");
      out.write("                <el-option label=\"启用\" value=\"1\"></el-option>\r\n");
      out.write("                <el-option label=\"禁用\" value=\"0\"></el-option>\r\n");
      out.write("            </el-select>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"企业名称\">\r\n");
      out.write("            <el-input v-model=\"brand.companyName\" placeholder=\"企业名称\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item label=\"品牌名称\">\r\n");
      out.write("            <el-input v-model=\"brand.brandName\" placeholder=\"品牌名称\"></el-input>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("\r\n");
      out.write("        <el-form-item>\r\n");
      out.write("            <el-button type=\"primary\" @click=\"onSubmit\">查询</el-button>\r\n");
      out.write("        </el-form-item>\r\n");
      out.write("    </el-form>\r\n");
      out.write("\r\n");
      out.write("    <!--按钮-->\r\n");
      out.write("\r\n");
      out.write("    <el-row>\r\n");
      out.write("\r\n");
      out.write("        <el-button type=\"danger\" plain @click=\"deleteByIds\">批量删除</el-button>\r\n");
      out.write("        <el-button type=\"primary\" plain @click=\"dialogVisible = true\">新增</el-button>\r\n");
      out.write("\r\n");
      out.write("    </el-row>\r\n");
      out.write("    <!--添加数据对话框表单-->\r\n");
      out.write("    <el-dialog\r\n");
      out.write("            title=\"编辑品牌\"\r\n");
      out.write("            :visible.sync=\"dialogVisible\"\r\n");
      out.write("            width=\"30%\"\r\n");
      out.write("    >\r\n");
      out.write("\r\n");
      out.write("        <el-form ref=\"form\" :model=\"brand\" label-width=\"80px\">\r\n");
      out.write("            <el-form-item label=\"品牌名称\">\r\n");
      out.write("                <el-input v-model=\"brand.brandName\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"企业名称\">\r\n");
      out.write("                <el-input v-model=\"brand.companyName\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"排序\">\r\n");
      out.write("                <el-input v-model=\"brand.ordered\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"备注\">\r\n");
      out.write("                <el-input type=\"textarea\" v-model=\"brand.description\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"状态\">\r\n");
      out.write("                <el-switch v-model=\"brand.status\"\r\n");
      out.write("                           active-value=\"1\"\r\n");
      out.write("                           inactive-value=\"0\"\r\n");
      out.write("                ></el-switch>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <el-form-item>\r\n");
      out.write("                <el-button type=\"primary\" @click=\"addBrand\">提交</el-button>\r\n");
      out.write("                <el-button @click=\"dialogVisible = false\">取消</el-button>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("        </el-form>\r\n");
      out.write("\r\n");
      out.write("    </el-dialog>\r\n");
      out.write("\r\n");
      out.write("    <!--修改表单-->\r\n");
      out.write("    <el-dialog\r\n");
      out.write("            title=\"修改品牌\"\r\n");
      out.write("            :visible.sync=\"updateDialogVisible\"\r\n");
      out.write("            width=\"30%\"\r\n");
      out.write("    >\r\n");
      out.write("        <el-form ref=\"form\" :model=\"brandSelect\" label-width=\"80px\">\r\n");
      out.write("            <el-form-item label=\"品牌名称\">\r\n");
      out.write("                <el-input  v-model=\"brandSelect.brandName\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"企业名称\">\r\n");
      out.write("                <el-input v-model=\"brandSelect.companyName\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"排序\">\r\n");
      out.write("                <el-input v-model=\"brandSelect.ordered\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"备注\">\r\n");
      out.write("                <el-input type=\"textarea\" v-model=\"brandSelect.description\"></el-input>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item label=\"状态\">\r\n");
      out.write("                <el-switch v-model=\"brandSelect.status\"\r\n");
      out.write("                           active-value=\"1\"\r\n");
      out.write("                           inactive-value=\"0\"></el-switch>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("\r\n");
      out.write("            <el-form-item>\r\n");
      out.write("                <el-button type=\"primary\" @click=\"update\">提交</el-button>\r\n");
      out.write("                <el-button @click=\"updateDialogVisible = false\">取消 </el-button>\r\n");
      out.write("            </el-form-item>\r\n");
      out.write("        </el-form>\r\n");
      out.write("    </el-dialog>\r\n");
      out.write("\r\n");
      out.write("    <!--表格-->\r\n");
      out.write("    <template>\r\n");
      out.write("        <el-table\r\n");
      out.write("                :data=\"tableData\"\r\n");
      out.write("                style=\"width: 100%\"\r\n");
      out.write("                :row-class-name=\"tableRowClassName\"\r\n");
      out.write("                @selection-change=\"handleSelectionChange\">\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    type=\"selection\"\r\n");
      out.write("                    width=\"55\">\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    type=\"index\"\r\n");
      out.write("                    width=\"50\">\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    prop=\"brandName\"\r\n");
      out.write("                    label=\"品牌名称\"\r\n");
      out.write("                    align=\"center\"\r\n");
      out.write("            >\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    prop=\"companyName\"\r\n");
      out.write("                    label=\"企业名称\"\r\n");
      out.write("                    align=\"center\"\r\n");
      out.write("            >\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    prop=\"ordered\"\r\n");
      out.write("                    align=\"center\"\r\n");
      out.write("                    label=\"排序\">\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    prop=\"status\"\r\n");
      out.write("                    align=\"center\"\r\n");
      out.write("                    label=\"当前状态\">\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("\r\n");
      out.write("            <el-table-column\r\n");
      out.write("                    align=\"center\"\r\n");
      out.write("                    label=\"操作\">\r\n");
      out.write("\r\n");
      out.write("                <template slot-scope=\"scope\">\r\n");
      out.write("                    <el-row>\r\n");
      out.write("                        <el-button type=\"primary\" @click=\"brandShow(scope.row)\">修改</el-button>\r\n");
      out.write("                        <el-button type=\"danger\" @click=\"deleteById(scope.row.id)\">删除</el-button>\r\n");
      out.write("                    </el-row>\r\n");
      out.write("                </template>\r\n");
      out.write("\r\n");
      out.write("            </el-table-column>\r\n");
      out.write("\r\n");
      out.write("        </el-table>\r\n");
      out.write("    </template>\r\n");
      out.write("\r\n");
      out.write("    <!--分页工具条-->\r\n");
      out.write("    <el-pagination\r\n");
      out.write("            @size-change=\"handleSizeChange\"\r\n");
      out.write("            @current-change=\"handleCurrentChange\"\r\n");
      out.write("            :current-page=\"currentPage\"\r\n");
      out.write("            :page-sizes=\"[5, 10, 15, 20]\"\r\n");
      out.write("            :page-size=\"5\"\r\n");
      out.write("            layout=\"total, sizes, prev, pager, next, jumper\"\r\n");
      out.write("            :total=\"400\">\r\n");
      out.write("    </el-pagination>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/vue.js\"></script>\r\n");
      out.write("<script src=\"element-ui/lib/index.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"element-ui/lib/theme-chalk/index.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/axios-0.18.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    new Vue({\r\n");
      out.write("        el: \"#app\",\r\n");
      out.write("\r\n");
      out.write("        mounted(){\r\n");
      out.write("            //当页面加载完成后，发送异步请求，获取数据\r\n");
      out.write("\r\n");
      out.write("            this.selectAll();\r\n");
      out.write("\r\n");
      out.write("            // var _this = this;\r\n");
      out.write("            //\r\n");
      out.write("            //  axios({\r\n");
      out.write("            //      method:\"get\",\r\n");
      out.write("            //      url:\"http://localhost:8080/brand-case/selectAllServlet\"\r\n");
      out.write("            //  }).then(function (resp) {\r\n");
      out.write("            //      _this.tableData = resp.data;\r\n");
      out.write("            //  })\r\n");
      out.write("\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        methods: {\r\n");
      out.write("\r\n");
      out.write("            // 查询所有数据\r\n");
      out.write("            selectAll(){\r\n");
      out.write("                var _this = this;\r\n");
      out.write("\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"get\",\r\n");
      out.write("                    url:\"http://localhost:8080/brand-case/brand/selectAll\"\r\n");
      out.write("                }).then(function (resp) {\r\n");
      out.write("                    _this.tableData = resp.data;\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            tableRowClassName({row, rowIndex}) {\r\n");
      out.write("                if (rowIndex === 1) {\r\n");
      out.write("                    return 'warning-row';\r\n");
      out.write("                } else if (rowIndex === 3) {\r\n");
      out.write("                    return 'success-row';\r\n");
      out.write("                }\r\n");
      out.write("                return '';\r\n");
      out.write("            },\r\n");
      out.write("            // 复选框选中后执行的方法\r\n");
      out.write("            handleSelectionChange(val) {\r\n");
      out.write("                this.multipleSelection = val;\r\n");
      out.write("\r\n");
      out.write("                console.log(this.multipleSelection)\r\n");
      out.write("            },\r\n");
      out.write("            // 查询方法\r\n");
      out.write("            onSubmit() {\r\n");
      out.write("                console.log(this.brand);\r\n");
      out.write("            },\r\n");
      out.write("            // 添加数据\r\n");
      out.write("            addBrand() {\r\n");
      out.write("                //console.log(this.brand);\r\n");
      out.write("                var _this = this;\r\n");
      out.write("\r\n");
      out.write("                // 发送ajax请求，添加数据\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    url:\"http://localhost:8080/brand-case/brand/add\",\r\n");
      out.write("                    data:_this.brand\r\n");
      out.write("                }).then(function (resp) {\r\n");
      out.write("                    if(resp.data == \"success\"){\r\n");
      out.write("                        //添加成功\r\n");
      out.write("\r\n");
      out.write("                        //关闭窗口\r\n");
      out.write("                        _this.dialogVisible = false;\r\n");
      out.write("\r\n");
      out.write("                        // 重新查询数据\r\n");
      out.write("                        _this.selectAll();\r\n");
      out.write("                        // 弹出消息提示\r\n");
      out.write("                        _this.$message({\r\n");
      out.write("                            message: '恭喜你，添加成功',\r\n");
      out.write("                            type: 'success'\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            //修改数据\r\n");
      out.write("            brandShow(row){\r\n");
      out.write("                this.brandSelect = row;\r\n");
      out.write("                console.log(this.brand);\r\n");
      out.write("                // 弹出窗口\r\n");
      out.write("                this.updateDialogVisible = true;\r\n");
      out.write("                console.log(this.updateDialogVisible);\r\n");
      out.write("                this.selectAll();\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            update() {\r\n");
      out.write("                var _this = this;\r\n");
      out.write("                axios({\r\n");
      out.write("                    method: \"post\",\r\n");
      out.write("                    url: \"http://localhost:8080/brand-case/brand/update\",\r\n");
      out.write("                    data: _this.brandSelect //这是提交的表单数据\r\n");
      out.write("                }).then(function (resp) {\r\n");
      out.write("                    //这里是success数据\r\n");
      out.write("                    if (resp.data == \"success\") {\r\n");
      out.write("                        //添加成功\r\n");
      out.write("                        _this.updateDialogVisible = false;\r\n");
      out.write("                        console.log(\"修改成功！\");\r\n");
      out.write("                        //重新查询数据进行显示\r\n");
      out.write("                        _this.selectAll();\r\n");
      out.write("                        _this.$message({\r\n");
      out.write("                            message: '恭喜你，修改成功',\r\n");
      out.write("                            type: 'success'\r\n");
      out.write("                        });\r\n");
      out.write("                    }\r\n");
      out.write("                    if (resp.data == \"fail\") {\r\n");
      out.write("                        _this.$message.error('修改失败');\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            //单列删除\r\n");
      out.write("            deleteById(id){\r\n");
      out.write("                var _this = this;\r\n");
      out.write("                _this.selectId = id;\r\n");
      out.write("                // 发送ajax请求，告诉后台id\r\n");
      out.write("                axios({\r\n");
      out.write("                    method:\"post\",\r\n");
      out.write("                    url:\"http://localhost:8080/brand-case/brand/deleteById?id=\"+_this.selectId\r\n");
      out.write("                }).then(function (resp) {\r\n");
      out.write("                    if(resp.data == \"success\"){\r\n");
      out.write("                        // 重新查询数据\r\n");
      out.write("                        _this.selectAll();\r\n");
      out.write("                        // 弹出消息提示\r\n");
      out.write("                        _this.$message({\r\n");
      out.write("                            message: '恭喜你，删除成功',\r\n");
      out.write("                            type: 'success'\r\n");
      out.write("                        });\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("\r\n");
      out.write("            //分页\r\n");
      out.write("            handleSizeChange(val) {\r\n");
      out.write("                console.log(`每页 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${val}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" 条`);\r\n");
      out.write("            },\r\n");
      out.write("            handleCurrentChange(val) {\r\n");
      out.write("                console.log(`当前页: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${val}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("`);\r\n");
      out.write("            },\r\n");
      out.write("            // 完成批量删除\r\n");
      out.write("            deleteByIds(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                //console.log(this.multipleSelection);\r\n");
      out.write("                /*\r\n");
      out.write("                [\r\n");
      out.write("                    {\r\n");
      out.write("                        \"brandName\": \"华为\",\r\n");
      out.write("                        \"companyName\": \"华为技术有限公司\",\r\n");
      out.write("                        \"description\": \"万物互联\",\r\n");
      out.write("                        \"id\": 1,\r\n");
      out.write("                        \"ordered\": 100,\r\n");
      out.write("                        \"status\": 1,\r\n");
      out.write("                        \"statusStr\": \"启用\"\r\n");
      out.write("                    },\r\n");
      out.write("                    {\r\n");
      out.write("                        \"brandName\": \"小米\",\r\n");
      out.write("                        \"companyName\": \"小米科技有限公司\",\r\n");
      out.write("                        \"description\": \"are you ok\",\r\n");
      out.write("                        \"id\": 2,\r\n");
      out.write("                        \"ordered\": 50,\r\n");
      out.write("                        \"status\": 1,\r\n");
      out.write("                        \"statusStr\": \"启用\"\r\n");
      out.write("                    },\r\n");
      out.write("                    {\r\n");
      out.write("                        \"brandName\": \"格力\",\r\n");
      out.write("                        \"companyName\": \"格力电器股份有限公司\",\r\n");
      out.write("                        \"description\": \"让世界爱上中国造\",\r\n");
      out.write("                        \"id\": 3,\r\n");
      out.write("                        \"ordered\": 30,\r\n");
      out.write("                        \"status\": 1,\r\n");
      out.write("                        \"statusStr\": \"启用\"\r\n");
      out.write("                    }\r\n");
      out.write("                ]\r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                //弹出确定的提示框\r\n");
      out.write("\r\n");
      out.write("                this.$confirm('此操作将删除该数据, 是否继续?', '提示', {\r\n");
      out.write("                    confirmButtonText: '确定',\r\n");
      out.write("                    cancelButtonText: '取消',\r\n");
      out.write("                    type: 'warning'\r\n");
      out.write("                }).then(() => {\r\n");
      out.write("                    //用户点击确认按钮\r\n");
      out.write("\r\n");
      out.write("                    //1.创建id数组[1,2,3],从this.multipleSelection  获取即可\r\n");
      out.write("                    for (let i = 0; i < this.multipleSelection.length; i++) {\r\n");
      out.write("                        let selectionElement = this.multipleSelection[i];\r\n");
      out.write("                        this.selectedIds[i] = selectionElement.id\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    //2. 发送ajax请求，添加数据\r\n");
      out.write("                    var _this = this;\r\n");
      out.write("\r\n");
      out.write("                    // 发送ajax请求，删除数据\r\n");
      out.write("                    axios({\r\n");
      out.write("                        method:\"post\",\r\n");
      out.write("                        url:\"http://localhost:8080/brand-case/brand/deleteByIds\",\r\n");
      out.write("                        data:_this.selectedIds\r\n");
      out.write("                    }).then(function (resp) {\r\n");
      out.write("                        if(resp.data == \"success\"){\r\n");
      out.write("                            //删除成功\r\n");
      out.write("\r\n");
      out.write("                            // 重新查询数据\r\n");
      out.write("                            _this.selectAll();\r\n");
      out.write("                            // 弹出消息提示\r\n");
      out.write("                            _this.$message({\r\n");
      out.write("                                message: '恭喜你，批量删除成功',\r\n");
      out.write("                                type: 'success'\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                }).catch(() => {\r\n");
      out.write("                    //用户点击取消按钮\r\n");
      out.write("\r\n");
      out.write("                    this.$message({\r\n");
      out.write("                        type: 'info',\r\n");
      out.write("                        message: '已取消删除'\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        },\r\n");
      out.write("        data() {\r\n");
      out.write("            return {\r\n");
      out.write("                //要删除ID\r\n");
      out.write("                selectId: 0,\r\n");
      out.write("                // 当前页码\r\n");
      out.write("                currentPage: 1,\r\n");
      out.write("                // 添加数据对话框是否展示的标记\r\n");
      out.write("                dialogVisible: false,\r\n");
      out.write("\r\n");
      out.write("                //修改的窗口显示控制\r\n");
      out.write("                updateDialogVisible: false,\r\n");
      out.write("\r\n");
      out.write("                // 品牌模型数据\r\n");
      out.write("                brand: {\r\n");
      out.write("                    status: '',\r\n");
      out.write("                    brandName: '',\r\n");
      out.write("                    companyName: '',\r\n");
      out.write("                    id: \"\",\r\n");
      out.write("                    ordered: \"\",\r\n");
      out.write("                    description: \"\"\r\n");
      out.write("                },\r\n");
      out.write("                brandSelect:{\r\n");
      out.write("                    status: '',\r\n");
      out.write("                    brandName: '',\r\n");
      out.write("                    companyName: '',\r\n");
      out.write("                    id: \"\",\r\n");
      out.write("                    ordered: \"\",\r\n");
      out.write("                    description: \"\"\r\n");
      out.write("                },\r\n");
      out.write("                //被选中的id数组\r\n");
      out.write("                selectedIds:[],\r\n");
      out.write("                // 复选框选中数据集合\r\n");
      out.write("                multipleSelection: [],\r\n");
      out.write("                // 表格数据\r\n");
      out.write("                tableData: [{\r\n");
      out.write("                    brandName: '现在为静态网页',\r\n");
      out.write("                    companyName: '需要运行服务器实现动态功能',\r\n");
      out.write("                    ordered: '13',\r\n");
      out.write("                    status: \"1\"\r\n");
      out.write("                }, {\r\n");
      out.write("                    brandName: '百度',\r\n");
      out.write("                    companyName: '百度在线网络技术有限公司',\r\n");
      out.write("                    ordered: '12',\r\n");
      out.write("                    status: \"1\"\r\n");
      out.write("                }, {\r\n");
      out.write("                    brandName: '阿里',\r\n");
      out.write("                    companyName: '阿里巴巴网络技术有限公司',\r\n");
      out.write("                    ordered: '11',\r\n");
      out.write("                    status: \"1\"\r\n");
      out.write("                }, {\r\n");
      out.write("                    brandName: '腾讯',\r\n");
      out.write("                    companyName: '腾讯计算机系统有限公司',\r\n");
      out.write("                    ordered: '10',\r\n");
      out.write("                    status: \"1\"\r\n");
      out.write("                }]\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
