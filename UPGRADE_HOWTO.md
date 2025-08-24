
UPGRADE_HOWTO - 如何后期升级灵宝（只替换 DecisionEngine）

目标：你以后只需替换 `app/src/main/java/com/lingbao/decision/DecisionEngine.kt`（或放置新的 model 到 assets/），然后 push 到 GitHub，Actions 会自动构建新的 APK。

步骤：
1. 打开你本地或手机上的 GitHub 仓库页面，进入 `app/src/main/java/com/lingbao/decision/`。
2. 点击 Add file -> Create new file。文件名填写：DecisionEngine.kt
3. 将我提供的新 DecisionEngine.kt 内容粘贴进去并 Commit。
4. 等待 GitHub Actions 构建成功，下载新的 APK，安装即可。
