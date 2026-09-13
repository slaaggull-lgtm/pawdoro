# 🐾 Pawdoro

### Study together. Focus better.

*A gamified, focus-first study companion app — Pomodoro sessions, a Study Buddy, and a cozy virtual library, built by a 5-person, AI-assisted team.*

[![Status](https://img.shields.io/badge/status-in%20development-orange?style=flat-square)](#-project-status)
[![Week](https://img.shields.io/badge/roadmap-week%201%20of%2016-blueviolet?style=flat-square)](#️-16-week-roadmap)
[![Team](https://img.shields.io/badge/team-5%20builders-blue?style=flat-square)](#-team-roles)

<br/>

<img src="https://skillicons.dev/icons?i=java,spring,postgres,kotlin,androidstudio,figma,git,github" alt="tech stack icons" />

</div>

---

## 📋 Table of Contents

- [📖 What is Pawdoro?](#-what-is-pawdoro)
- [✨ Feature Overview](#-feature-overview)
- [🚧 Project Status](#-project-status)
- [🏗️ Technology & Architecture](#️-technology--architecture)
- [📁 Repository Structure](#-repository-structure-backend-current)
- [🚀 Getting Started](#-getting-started-backend)
- [👥 Team Roles](#-team-roles)
- [🗺️ 16-Week Roadmap](#️-16-week-roadmap)

---

## 📖 What is Pawdoro?

Pawdoro is a mobile study-productivity app aimed at students who want their focus sessions to feel less lonely and less mechanical. It pairs a classic **Pomodoro timer** with a personal **human avatar** and a selectable **animal Study Buddy** (cat, rabbit, fox, panda, koala...), wraps progress in an **XP / Level / Streak** system, and adds a calm, book-lined **virtual library** where users can sit and work alongside friends — without a chat window pulling their attention away.

> 🎯 **Target users** — students preparing for exams (from casual daily study habits to long-term exam prep such as national university entrance exams), who want gentle accountability, a sense of companionship while studying alone, and visible, rewarding progress over time.

> 🎨 **Design philosophy** — a premium, minimalist **pastel** visual identity, a dim/night "library" atmosphere, soft transitions, and a battery-friendly static/OLED mode for long study sessions — calm enough not to distract from the actual work.

> ℹ️ This README describes the **full product vision**. The [Project Status](#-project-status) section states plainly what is actually implemented today versus what is planned.

---

## ✨ Feature Overview

<details>
<summary><b>🎨 Visual Identity & Battery Optimization</b></summary>
<br/>

- Minimalist pastel design language, muted and easy on the eyes
- Light/dark theme with soft animated transitions
- OLED/static power-saving mode for long screen-on sessions
</details>

<details>
<summary><b>🧑‍🎓🐱 Study Buddy & Human Avatar</b></summary>
<br/>

- Customizable human avatar representing the user
- Selectable animal Study Buddy (cat, rabbit, fox, panda, koala, etc.)
- Contextual animations (studying, resting, drinking coffee together) and mood changes tied to study state
</details>

<details>
<summary><b>⏱️ Pomodoro, Strict Focus Mode & Offline-First</b></summary>
<br/>

- Configurable timer (25 / 40 / 50 / 60 min, or freeform)
- **Strict Focus Mode**: leaving the app during a session marks it "Interrupted"
- Flexible breaks — no forced auto-start of the next session
- **Offline-first**: Pomodoro works without internet; data syncs once connectivity returns
</details>

<details>
<summary><b>📚 Subjects & Exam Countdown</b></summary>
<br/>

- Add/edit/delete subjects with custom colors and icons
- Per-subject accumulated study time and last-studied timestamp
- Live countdown card for upcoming exams ("120 days until finals")
</details>

<details>
<summary><b>🎯 Goals & Daily Rewards</b></summary>
<br/>

- Daily/weekly study goal setting with progress bar
- Daily **Loot Box** reward for consistent, goal-completing users
</details>

<details>
<summary><b>⭐ Streaks</b></summary>
<br/>

- Duolingo-style daily streak, with a custom "constellation/magic star" icon instead of a generic flame
- **Streak Freeze** protection and streak-based badges
</details>

<details>
<summary><b>✨ XP & Levels</b></summary>
<br/>

- XP earned from study time, level progression bar, level-up celebration animation
- New rewards unlocked per level
</details>

<details>
<summary><b>🛍️ Badges, Store & Seasonal Cosmetics</b></summary>
<br/>

- Achievement, streak, and subject-based badges
- Cosmetic marketplace: outfits/accessories for the avatar, the Study Buddy, and the desk
- Limited-time seasonal collections (Halloween, New Year, Spring, etc.)
</details>

<details>
<summary><b>🪑 Study Rooms & Live Presence</b></summary>
<br/>

- Private rooms (up to 5 people) via code/link, and a public "library" room (up to 15 people)
- Ambient night/day/dim library atmosphere with desk-lamp lighting
- Lo-fi music, rain, and library ambience sound options
</details>

<details>
<summary><b>👥 Social Features</b></summary>
<br/>

- **Buddy Call**: one-tap preset message bubbles ("Coming to the desk, join me!")
- **Silent Presence**: non-intrusive micro-interactions — Silent Clap 👏, Nudge 🤜🤛, Send Coffee ☕
- Friends system (add/accept/remove) and a weekly leaderboard scoped to friends only (no global leaderboard)
</details>

<details>
<summary><b>📊 Statistics & AI Insights</b></summary>
<br/>

- Daily/weekly study charts, total time, most-studied subject, completed Pomodoro count
- **AI Study Insights**: personalized analysis (e.g. "You focus best between 9–11 AM — schedule harder subjects then")
- Full study history log
</details>

<details>
<summary><b>👤 Profile, Notifications, Onboarding & Settings</b></summary>
<br/>

- Profile with avatar, Buddy, level, XP, streak, upcoming exam countdown, and stats summary
- Notifications for session completion, daily goals, streak reminders, and Buddy Calls
- Onboarding flow: welcome, avatar/Buddy creation, goal setting, adding subjects
- Settings for account, focus behavior, appearance, sound, and privacy
</details>

<details>
<summary><b>🔒 Security & Anti-Cheat</b></summary>
<br/>

- Single active session per user (no parallel timers across devices)
- Automatic detection of implausible, non-human continuous study durations
- Time-validation checks to keep the friends leaderboard fair
- Invite-code/link protection for private rooms
- Secure storage of credentials and study history
</details>

---

## 🚧 Project Status

**Roadmap progress:** `🟩⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜` **Week 1 of 16**

| | |
|---|---|
| ✅ **Completed — Week 1 (Backend skeleton)** | 🔜 **Planned / Coming Soon** |
| • Spring Boot 3 + PostgreSQL project skeleton (`pawdoro-backend`)<br>• Runnable app with env-variable-based datasource config<br>• Health/status endpoints (`/actuator/health`, `/api/v1/ping`)<br>• Local PostgreSQL via `docker-compose`<br>• Base test setup (`PingControllerTest`) | Domain entities, JWT authentication, Android app screens, avatar/Buddy system, Pomodoro logic, subjects & exams, goals & loot boxes, streaks, XP/levels, store, study rooms, social features, statistics, AI Insights, notifications, onboarding, settings, and the full anti-cheat system. **None of it exists in the codebase yet** — see the [roadmap](#️-16-week-roadmap) below. |

---

## 🏗️ Technology & Architecture

| Layer | Technology |
|---|---|
| 🖥️ Backend | Java 21, Spring Boot 3 (Web, Data JPA, Validation, Actuator, Security planned) |
| 🗄️ Database | PostgreSQL 16+ |
| 📱 Mobile (Android) | Kotlin, Jetpack Compose, Retrofit, Room (offline cache) |
| 🎨 Design | Figma, Illustrator/Inkscape/Canva |
| 🖼️ AI-generated art | Midjourney / DALL·E 3 / Ideogram / Recraft.ai |
| 🔌 Realtime (planned) | WebSocket (study rooms, live presence) |
| 🔐 Auth (planned) | Spring Security + JWT |
| 🛠️ Tooling | IntelliJ IDEA, Android Studio, Postman/Bruno, Git & GitHub |

## 📁 Repository Structure (backend, current)

```
pawdoro-backend/
├── docker-compose.yml               # Local PostgreSQL for development
├── pom.xml                          # Maven build definition
├── src/
│   ├── main/
│   │   ├── java/com/pawdoro/backend/
│   │   │   ├── PawdoroBackendApplication.java
│   │   │   ├── controller/PingController.java
│   │   │   └── dto/StatusResponse.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application-dev.properties
│   └── test/
│       └── java/com/pawdoro/backend/controller/PingControllerTest.java
├── README.md
└── README_TR.md
```

---

## 🚀 Getting Started (Backend)

**Requirements:** JDK 21, Maven (or the included wrapper), Docker (for local PostgreSQL).

```bash
# 1. Start a local PostgreSQL instance
docker compose up -d

# 2. Run the backend (defaults match docker-compose.yml)
./mvnw spring-boot:run

# 3. Verify it's alive
curl http://localhost:8080/api/v1/ping
curl http://localhost:8080/actuator/health
```

Connection settings can be overridden via environment variables: `DB_URL`, `DB_USERNAME`, `DB_PASSWORD`, `SERVER_PORT`.

---

## 👥 Team Roles

| Role | Responsibility |
|---|---|
| 🖥️ Backend AI Lead | Java/Spring Boot code, PostgreSQL entities, JWT security, anti-cheat logic |
| 📱 Android AI Lead | Kotlin/Compose screens, Retrofit integration, offline Room database |
| 🎨 UI/UX & Visual AI Lead | Pastel palettes, avatar/Buddy art, room atmospheres, icon sets |
| ⭐ Gamification AI Lead | XP, Level, Streak, Loot Box, store logic, social/ranking rules |
| 📅 QA, Analytics & Flow Lead | User flows, AI Insights prompts/algorithms, test scenarios, bug triage |

Each role pairs with AI tools (e.g. Claude, ChatGPT, Cursor, Midjourney) to generate and refine their part of the codebase, designs, and content, then integrates the output into the shared project.

---

## 🗺️ 16-Week Roadmap

| Week | Focus |
|---|---|
| 1 | ✅ Skeleton setup (Spring Boot + PostgreSQL, Compose project, design system, gamification rules doc, user flows) |
| 2 | Core building blocks: entities, base screens, key Figma designs, XP icon set |
| 3 | Login / Register / JWT authentication |
| 4 | Human avatar & Study Buddy selection |
| 5 | Subjects system & exam countdown |
| 6 | Pomodoro timer & Strict Focus Mode |
| 7 | Weekly schedule builder |
| 8 | Schedule + Pomodoro integration |
| 9 | Dashboard (home screen) |
| 10 | Gamification: XP, Level, Streak & Streak Freeze |
| 11 | Goals, rewards, Loot Box & cosmetic store |
| 12 | Statistics & offline-first sync |
| 13 | Friends system & weekly ranking |
| 14 | Study rooms & live interaction |
| 15 | AI Insights, security & settings |
| 16 | 🔴 Bug fixing & QA pass (no new features) |

---

<div align="center">

*This document reflects the product vision from the team's planning materials. Feature status is kept accurate as development progresses — see [Project Status](#-project-status) for what's actually shipped today.*

</div>

