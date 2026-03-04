# 🚀 0단계 - 컴포즈 기초
## 과제 진행 요구 사항
- 미션은 칸반 보드 태스크 저장소를 포크하고 클론하는 것으로 시작한다.
- 온라인 코드 리뷰 요청 1단계 문서를 참고하여 실습 환경을 구축한다.
1. 미션 시작 버튼을 클릭하여 미션을 시작한다.
2. 저장소에 GitHub 사용자 이름으로 브랜치가 생성되었는지 확인한다.
3. 저장소를 내 계정으로 포크한다.
- 기능을 구현하기 전 README.md에 구현할 기능 목록을 정리해 추가한다.
- Git의 커밋 단위는 앞 단계에서 README.md에 정리한 기능 목록 단위로 추가한다.
  - AngularJS Git Commit Message Conventions을 참고해 커밋 메시지를 작성한다.

## 기능 요구 사항
### 1. 실패하는 학습 테스트 통과시키기 
- 아래 파일의 테스트가 모두 성공하도록 한다.
```bash
composeApp/src/commonTest/woowacourse/kanban/board/study/LayoutBasicsTest.kt
```
### 2. `3분 실습` 구현하기
- `힌트`의 `3분 실습`에 기재된 내용을 구현한다.
1. "Jetpack Compose Text 실습 표시하기"
   - 크기는 `22sp`
   - 색상은 `Blue`
   - 굵기는 `Bold`

2. "`PainterResource` 사용하여 이미지 리소스 표시, `Icons.Default.Favorite` 사용해서 `Image` 표시"
3. `저장` 텍스트 버튼 만들기, ❤️ 이미지 버튼 만들기
4. `❤️ 좋아요` 아이콘 버튼 만들기
5. 50 * 50 정사각형 빨노초를 왼쪽 위/중앙/오른쪽 아래 배치