# 📝 Backend Project Documentation

## 1. Project Overview

This backend is built using **Node.js and Express**, following a **modular, feature-based architecture**. Each module contains all necessary files (controller, service, model, routes, validation), enabling **parallel development** and **easy maintenance**.

**API Versioning:** `/api/v1/...` (future versions can be added as `/api/v2/...`).

---

## 2. Folder Structure & Responsibilities

```text
src/
 ├── modules/
 │    ├── auth/
 │    │    ├── auth.controller.js
 │    │    ├── auth.service.js
 │    │    ├── auth.model.js
 │    │    ├── auth.routes.js
 │    │    ├── auth.validation.js
 │    │    └── index.js
 │    │
 │    ├── users/
 │    │    ├── user.controller.js
 │    │    ├── user.service.js
 │    │    ├── user.model.js
 │    │    ├── user.routes.js
 │    │    ├── user.validation.js
 │    │    └── index.js
 │    │
 │    ├── providers/
 │    │    ├── provider.controller.js
 │    │    ├── provider.service.js
 │    │    ├── provider.model.js
 │    │    ├── provider.routes.js
 │    │    ├── provider.validation.js
 │    │    └── index.js
 │    │
 │    ├── services/
 │    │    ├── service.controller.js
 │    │    ├── service.service.js
 │    │    ├── service.model.js
 │    │    ├── service.routes.js
 │    │    ├── service.validation.js
 │    │    └── index.js
 │    │
 │    ├── availability/
 │    │    ├── availability.controller.js
 │    │    ├── availability.service.js
 │    │    ├── availability.model.js
 │    │    ├── availability.routes.js
 │    │    ├── availability.validation.js
 │    │    └── index.js
 │    │
 │    ├── appointments/
 │    │    ├── appointment.controller.js
 │    │    ├── appointment.service.js
 │    │    ├── appointment.model.js
 │    │    ├── appointment.routes.js
 │    │    ├── appointment.validation.js
 │    │    └── index.js
 │    │
 │    ├── notifications/
 │    │    ├── notification.controller.js
 │    │    ├── notification.service.js
 │    │    ├── notification.model.js
 │    │    ├── notification.routes.js
 │    │    ├── notification.validation.js
 │    │    └── index.js
 │    │
 │    ├── reviews/
 │    │    ├── review.controller.js
 │    │    ├── review.service.js
 │    │    ├── review.model.js
 │    │    ├── review.routes.js
 │    │    ├── review.validation.js
 │    │    └── index.js
 │    │
 │    └── admin/
 │         ├── admin.controller.js
 │         ├── admin.service.js
 │         ├── admin.model.js
 │         ├── admin.routes.js
 │         ├── admin.validation.js
 │         └── index.js
 │
 ├── shared/
 │    ├── middleware/
 │    │    ├── auth.middleware.js
 │    │    ├── error.middleware.js
 │    │    └── index.js
 │    │
 │    ├── utils/
 │    │    ├── logger.js
 │    │    ├── helpers.js
 │    │    └── index.js
 │    │
 │    └── config/
 │         ├── db.config.js
 │         ├── env.config.js
 │         └── index.js
 │
 ├── routes/
 │    └── app.js
 │
 └── server.js
```

---

## 3. Module Details

| Module            | Responsibilities                                           |
| ----------------- | ---------------------------------------------------------- |
| **auth**          | Signup, login, JWT generation/verification, password reset |
| **users**         | User profile management, account info                      |
| **providers**     | Service provider profiles, approval/verification           |
| **services**      | Service listings, categories, pricing                      |
| **availability**  | Provider schedule, available slots                         |
| **appointments**  | Bookings, cancellations, updates                           |
| **notifications** | Sending emails, SMS, push notifications                    |
| **reviews**       | Ratings, comments, feedback                                |
| **admin**         | Admin dashboard, managing users/providers/services         |

**File Roles Within a Module:**

| File              | Purpose                                            |
| ----------------- | -------------------------------------------------- |
| `*.controller.js` | Receives requests, calls services, sends responses |
| `*.service.js`    | Business logic, orchestrates models                |
| `*.model.js`      | Database schemas and queries                       |
| `*.routes.js`     | Maps HTTP endpoints to controllers                 |
| `*.validation.js` | Validates incoming request data                    |
| `index.js`        | Optional: clean export for module functions        |

---

## 4. Shared Folder

| Folder         | Purpose                                                  |
| -------------- | -------------------------------------------------------- |
| **middleware** | Pre/post request logic (auth checks, error handling)     |
| **utils**      | Reusable helpers (logging, formatting, common functions) |
| **config**     | Database setup, environment configuration                |

---

## 5. Central Routes (`routes/app.js`)

```js
const express = require('express');
const router = express.Router();

router.use('/auth', require('../modules/auth/auth.routes'));
router.use('/users', require('../modules/users/user.routes'));
router.use('/providers', require('../modules/providers/provider.routes'));
router.use('/services', require('../modules/services/service.routes'));
router.use('/availability', require('../modules/availability/availability.routes'));
router.use('/appointments', require('../modules/appointments/appointment.routes'));
router.use('/notifications', require('../modules/notifications/notification.routes'));
router.use('/reviews', require('../modules/reviews/review.routes'));
router.use('/admin', require('../modules/admin/admin.routes'));

module.exports = router;
```

---

## 6. Server Setup (`server.js`)

```js
const express = require('express');
const app = express();
const appRoutes = require('./routes/app');

app.use(express.json());
app.use('/api/v1', appRoutes);

app.listen(process.env.PORT || 5000, () => {
    console.log('Server running...');
});
```

---

## 7. Request Flow

1. Client calls `/api/v1/<module>/<endpoint>`
2. Request hits **route** → mapped to **controller**
3. Controller calls **service** → applies business logic → interacts with **model**
4. Service returns result → controller sends response
5. Errors handled globally via **middleware**

---

## 8. Setup Instructions

```bash
# 1. Clone repo
git clone <repo-url>

# 2. Install dependencies
npm install

# 3. Create .env file
PORT=5000
DB_URL=<your-db-url>
JWT_SECRET=<your-secret>

# 4. Start server
npm run dev
```

---

## 9. Development Guidelines

* Follow the **module structure strictly**
* Validate **all input** using module validation files
* Reuse **shared/utils** wherever possible
* Keep modules **loosely coupled**
* Handle errors via **middleware**, not repeated try/catch

---
