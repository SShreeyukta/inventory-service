# AI Production Debugger

## Overview

AI-powered production incident investigation platform for Java microservices.

The system automatically captures failures from the payment service, collects
incident evidence including logs and Kafka metadata, retrieves relevant
historical incidents using pgvector-based semantic search, and uses a local
LLM to generate evidence-grounded root-cause hypotheses and remediation
recommendations.

## Architecture

Order Service
      |
      v
    Kafka
   /     \
  v       v
Payment  Inventory
 Service  Service
   |
   | failure
   v
AI Debugger
   |
   +--> pgvector RAG
   |
   +--> Ollama / Qwen3
   |
   v
Incident Analysis
   |
   v
PostgreSQL

## Tech Stack

- Java 21
- Spring Boot
- Spring Kafka
- Apache Kafka
- PostgreSQL
- pgvector
- Spring AI
- Ollama
- Qwen3
- Maven
- REST APIs

## Key Features

- Event-driven microservice architecture
- Kafka-based asynchronous processing
- Automatic production incident capture
- Kafka topic, partition and offset correlation
- Historical incident retrieval using vector similarity search
- RAG-based investigation
- Local LLM-powered root-cause analysis
- Evidence vs hypothesis separation
- Confidence assessment
- Recommended remediation actions
- Persistent incident investigations

## Example Investigation

Payment database connection timeout

Root Cause:
Not confirmed

Hypothesis:
Leaked database connections causing connection pool exhaustion

Confidence:
Low

Missing Evidence:
- Connection pool metrics
- Connection leak traces
- Database/network diagnostics

Recommended Actions:
- Check connection pool metrics
- Investigate connection leaks
- Verify database connectivity