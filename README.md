# DeliveryOS Local

A local-first delivery workspace with a plain HTML, CSS, and JavaScript interface and a Java Spring Boot backend. It stores project and team data in an embedded H2 database on this computer. This is an independent demo of common enterprise delivery workflows; it is not a Coforge product and is not affiliated with or endorsed by Coforge.

## Start on Windows

1. Install a Java Development Kit (JDK) version 17 or later.
2. Extract the ZIP and double-click `start-local.cmd`.
3. The ZIP includes a ready-to-run application. Maven and Spring dependencies are only downloaded if you remove the included application JAR and build from source.
4. Open [http://127.0.0.1:4180](http://127.0.0.1:4180) if the browser does not open automatically.
5. Sign in using the starter account below and choose a new password when prompted.

**Starter sign-in:** `admin@local.test` / `ChangeMe123!`

The app binds to this computer only. Keep the command window open while using it; press Ctrl+C to stop. The database is created automatically under `data/` and remains there between launches. Back up that folder to preserve your workspace.

## Included workflows

- Overview metrics, delivery health, task progress, and recent activity.
- Projects with client, owner, dates, status, health, and task completion.
- A four-stage task board with drag-and-drop status changes.
- Task priorities, details, assignees, due dates, and comments.
- Administrator, delivery manager, team member, and read-only roles.
- Team accounts, forced password change for new accounts, and audit history.
- Persistent local H2 database, password hashing, HTTP-only session cookies, CSRF checks, role-aware write access, and login throttling.

## Roles

| Role | Access |
| --- | --- |
| Administrator | Projects, tasks, team accounts, audit history, and workspace settings |
| Delivery manager | Projects and tasks, project activity, and team visibility |
| Team member | Tasks, comments, and project visibility |
| Read only | Workspace visibility without changes |

This is a local prototype for evaluation and extension. It does not provide internet hosting, company single sign-on, remote collaboration, backups, or encryption at rest. Do not use it for confidential or production data without a security review and additional deployment work. No real company data or credentials are included.
