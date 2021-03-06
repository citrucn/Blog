### 简介
基于 SpringBoot 和 Nuxt 的前后端分离博客

线上地址：[citru.cn](https://citru.cn)

### 项目地址
后端项目：[https://github.com/citrucn/Blog](https://github.com/citrucn/Blog)  

后端码云地址：[https://gitee.com/citru/Blog](https://gitee.com/citru/Blog)  

前端项目：[https://github.com/citrucn/Blog-Frontend](https://github.com/citrucn/Blog-Frontend) 
 
前端码云项目：[https://gitee.com/citru/Blog-Frontend](https://gitee.com/citru/Blog-Frontend)

### SQL文件
blog.sql

初始账号密码：Linter

### Nginx配置
```
location / {
    proxy_pass http://127.0.0.1:3000;
}

location ~ .*\.(gif|jpg|jpeg|png)$
{
    proxy_pass http://127.0.0.1:3000;
}
    
location ~ .*\.(js|css|woff|ttf|ico)?$
{
    proxy_pass http://127.0.0.1:3000;
}
```

### 截图
#### 首页
![首页](screenshot/blog-index.png)
#### 登录
![登录](screenshot/blog-login.png)
#### 分类
![分类](screenshot/blog-catalog.png)
#### 文章
![文章](screenshot/blog-article.png)
#### 评论
![评论](screenshot/blog-comment-new.png)
#### 搜索
![搜索](screenshot/blog-search.png)
#### 后台首页
![后台首页](screenshot/blog-admin-index.png)
#### 发布文章
![发布文章](screenshot/blog-article-new.png)
#### 文章管理
![文章管理](screenshot/blog-article-list.png)
#### 新增分类
![新增分类](screenshot/blog-category-new.png)
#### 编辑分类
![编辑分类](screenshot/blog-category-edit.png)
#### 分类管理
![分类管理](screenshot/blog-category-list.png)
#### 评论管理
![评论管理](screenshot/blog-comment-list.png)
#### 新增用户
![新增用户](screenshot/blog-user-new.png)
#### 用户管理
![用户管理](screenshot/blog-user-list.png)