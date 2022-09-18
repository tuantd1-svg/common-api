package com.example.commonapi.parameter.enumable;


import lombok.Getter;

public enum SystemParameter {
    TIME_EXPIRE("TIME_EXPIRE", "60"),

    REGION("REGION","VN"),

    MAIL_USER_CONFIG("MAIL_USER_CONFIG","tuan9x96@gmail.com"),

    MAIL_PASSWORD_CONFIG("MAIL_PASSWORD_CONFIG","06041996"),

    MAIL_TEMPLATE_ADD_USER("MAIL_CONTENT_ADD_USER","<html>    <head>       <style media=\"screen\">          body {          font-family: sans-serif;          margin: 0;          padding: 0;          }          .outer {          display: table;          position: absolute;          height: 100%;          width: 100%;          }          .middle {          display: table-cell;          vertical-align: middle;          }          .inner {          margin-left: auto;          margin-right: auto;          position: relative;          width: 600px;          border-radius: 10px;          box-shadow: 0 2px 2px 0 #8b8b8b;          background-color: #f5f6fa;          margin-bottom: 28px;          overflow: hidden;          }          .header {          padding: 20px;          background-color: #fedc00;          }          .logo {          width: 150px;          height: 15px;          }          .logo img {          width: 100%;          }          .body {          padding: 45px 25px 25px 25px;          font-size: 14px;          }          .body .top {          font-size: 18px;          font-weight: bold;          color: #0072bb          }          .body .mid {          border-top: 1px dotted #0072bb;          border-bottom: 1px dotted #0072bb;          margin: 16px 0;          }          .footer {          text-align: center;          font-size: 14px;          }          .service{          text-align: center;          color:#FF0000;          font-size: 16px;          }       </style>    </head>    <body>       <div class=\"outer\">          <div class=\"middle\">             <div class=\"inner\">                <div class=\"header\">                   <div class=\"logo\">                      <img src=\"data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9Ii0xMS41IC0xMC4yMzE3NCAyMyAyMC40NjM0OCI+CiAgPHRpdGxlPlJlYWN0IExvZ288L3RpdGxlPgogIDxjaXJjbGUgY3g9IjAiIGN5PSIwIiByPSIyLjA1IiBmaWxsPSIjNjFkYWZiIi8+CiAgPGcgc3Ryb2tlPSIjNjFkYWZiIiBzdHJva2Utd2lkdGg9IjEiIGZpbGw9Im5vbmUiPgogICAgPGVsbGlwc2Ugcng9IjExIiByeT0iNC4yIi8+CiAgICA8ZWxsaXBzZSByeD0iMTEiIHJ5PSI0LjIiIHRyYW5zZm9ybT0icm90YXRlKDYwKSIvPgogICAgPGVsbGlwc2Ugcng9IjExIiByeT0iNC4yIiB0cmFuc2Zvcm09InJvdGF0ZSgxMjApIi8+CiAgPC9nPgo8L3N2Zz4K\" alt=\"Madistion\">                   </div>                </div>                <div class=\"body\">                   <div class=\"top\">                      <span>&title</span>                   </div>                   <div class=\"mid\">                      <div class=\"service\">                         <p><strong>%s</strong></p>                      </div>                   </div>                   <div class=\"footer\">                      <strong><i>Liên hệ hỗ trợ</i></strong>                      <p>0975010556</p>                      <p>SaleShopCenter 41/5 Mai Lão Bạng,P.13 ,Q.Tân Bình</p>                   </div>                </div>             </div>          </div>       </div>    </body> </html>"),

    URL_AUTH_SERVICE("URL_AUTH_SERVICE","authenticate/","AUTH_SERVICE","http://172.20.0.11:9999/","/authenticate/**"),

    URL_CHECK_USERS("URL_CHECK_USERS","users/checkUserRegisters/","OTHER_SERVICE","http://172.20.0.12:8888/","/users/checkUserRegisters/**"),

    URL_CREATE_USER("URL_CREATE_USER","users/addUser/","OTHER_SERVICE","http://172.20.0.12:8888/","/users/addUser/**"),

    URL_CONFIRM_CREATE_USER("URL_CONFIRM_CREATE_USER","users/confirmAddUser/","OTHER_SERVICE","http://172.20.0.12:8888/","users/confirmAddUser/**"),

    FRONTEND_URL_SALE_SHOP("FRONTEND_URL_SALE_SHOP","","FRONT_END","http://localhost:3000",""),

    URL_SHOP("URL_SHOP","","BACKEND_SHOP","http://127.0.0.1:8888/shop",""),

    URL_AUTH_SERVICE_SHOP("URL_AUTH_SERVICE_SHOP","api/auth/login","AUTH_SERVICE","http://172.20.0.11:9999/","/api/auth/login/**"),

    URL_AUTH_CHECK("URL_AUTH_CHECK","api/auth/get","AUTH_SERVICE","http://172.20.0.11:9999/","/api/auth/get/**"),

    URL_INIT_RESET_PASSWORD("URL_INIT_RESET_PASSWORD","users/initResetPassword/","OTHER_SERVICE","http://172.20.0.12:8888/","/users/initResetPassword/**"),

    URL_CONFIRM_RESET_PASSWORD("URL_CONFIRM_RESET_PASSWORD","users/ConfirmResetPassword/","OTHER_SERVICE","http://172.20.0.12:8888/","/users/ConfirmResetPassword/**"),

    URL_RESET_PASSWORD("URL_RESET_PASSWORD","users/ResetPassword/","OTHER_SERVICE","http://172.20.0.12:8888/","/users/ResetPassword/**");

    @Getter
    private String param;
    @Getter
    private String defaultValue;

    @Getter
    private String groupService;

    @Getter
    private String prefixUri;

    @Getter
    private String pattern;

    @Getter
    private String ports;
    SystemParameter(String param, String defaultValue, String groupService, String prefixUri, String pattern)
    {
        this.param= param;
        this.defaultValue = defaultValue;
        this.groupService= groupService;
        this.prefixUri= prefixUri;
        this.pattern = pattern;
    }
    SystemParameter(String param, String defaultValue, String groupService, String prefixUri, String pattern, String port)
    {
        this.param= param;
        this.defaultValue = defaultValue;
        this.groupService= groupService;
        this.prefixUri= prefixUri;
        this.pattern = pattern;
        this.ports = port;
    }
    SystemParameter(String param, String defaultValue)
    {
        this.param= param;
        this.defaultValue = defaultValue;
    }
    public String getURL()
    {
        return this.prefixUri.concat(this.defaultValue);
    }
}
