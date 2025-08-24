
LingBao - GitHub-ready Project (D1)
----------------------------------

This project is prepared to be uploaded to a GitHub repository and built by GitHub Actions.
It is intentionally minimal (only Android SDK, no external dependencies) to maximize CI success.

How to use (mobile-only):
1. Create a new GitHub repository.
2. Upload all files from this project (preserve folder structure).
3. On GitHub, go to Actions -> run 'Android CI - Build APK' or push to trigger.
4. After build completes, download artifact 'lingbao-apk' -> app-debug.apk and install on your phone.

Upgrade flow:
- Replace `app/src/main/java/com/lingbao/decision/DecisionEngine.kt` with a smarter implementation or TFLite loader.
- Push to GitHub -> Actions auto-builds a new APK.
