# 🧠 Spring AI Chat Demo

A simple Spring Boot application demonstrating **AI text generation and streaming** using **Spring AI** and an interactive HTML frontend — all without any external UI framework.

---

## 🚀 Features

- REST endpoints for text generation (`/ai/generate`) and live streaming (`/ai/generateStream`)
- Simple HTML UI (`test-ai.html`) for prompt testing
- Markdown rendering for LLM responses
- Smooth streaming output via **Server-Sent Events (SSE)**
- Customizable system prompts for behavior control
- No frontend framework (pure HTML, JS, and CSS)

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|-------------|
| Backend | Spring Boot 3.x |
| AI Integration | Spring AI (with OpenAI / Anthropic / Ollama, etc.) |
| Reactive Streaming | Project Reactor (Flux + SSE) |
| Frontend | HTML + JavaScript (no React/Vue) |
| Build Tool | Maven |

---

## 📦 Prerequisites

1. **Java 17+**
2. **Maven**
3. An AI model provider (e.g. OpenAI API key)

Add your API key to `application.properties`:

```properties
spring.ai.openai.api-key=gsk_RemainingKey
