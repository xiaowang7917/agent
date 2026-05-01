# Lab Agent Pro 🚀

## 项目简介
高校实验室智能调度与AI问答系统（Agent）

## 功能
- 实验室预约调度（可扩展）
- AI问答接口（支持接入大模型）
- 操作日志记录
- 前后端分离

## 技术栈
- Spring Boot
- Vue2 + Axios

## 启动方式
```bash
cd backend
mvn spring-boot:run
```

打开 frontend/index.html

## API示例
POST /api/chat
{
  "message":"如何预约实验室"
}

返回：
{
  "reply":"AI: 已收到问题..."
}

## 可扩展方向
- 接入OpenAI / 通义千问
- JWT登录系统
- MySQL数据库
- Docker部署

## 项目亮点
✔ Agent架构  
✔ 可扩展AI能力  
✔ 前后端完整闭环