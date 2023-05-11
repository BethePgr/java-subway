package subway.domain.section.view;

public class SectionOutputView {

    public static void sectionMain(){
        System.out.println("\n## 구간 관리 화면\n"
            + "1. 구간 등록\n"
            + "2. 구간 삭제\n"
            + "B. 돌아가기");
    }

    public static void sectionAdded(){
        System.out.println("\n[INFO] 구간이 등록되었습니다.");
    }

    public static void sectionDeleted(){
        System.out.println("\n[INFO] 구간이 삭제되었습니다.");
    }
}
