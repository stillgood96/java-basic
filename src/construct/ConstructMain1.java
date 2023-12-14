package construct;

public class ConstructMain1 {

  public static void main(String[] args) {

    MemberConstruct member1 = new MemberConstruct("memberA", 15, 90);
    MemberConstruct member2 = new MemberConstruct("memberA", 16, 80);


    MemberConstruct[] members = {member1, member2};

    for (MemberConstruct member : members) {
      System.out.printf("이름: %s, 나이: %d, 성적: %d\n", member.name, member.age, member.grade);
    }

  }
}
