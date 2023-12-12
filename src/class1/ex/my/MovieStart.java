package class1.ex.my;

public class MovieStart {

  public static void main(String[] args) {

    MoviewReview mv1 = new MoviewReview();
    mv1.title = "살인의 추억";
    mv1.review = "밥은 먹고 다니냐 ?";

    MoviewReview mv2 = new MoviewReview();
    mv2.title = "서울의 봄";
    mv2.review = "실패하면 반역 성공하면 혁명 아입니까 ?";

    MoviewReview[] moviewRevies = {mv1, mv2};


    for(MoviewReview mv : moviewRevies) {

      System.out.printf("영화제목: %s, 리뷰: %s \n",mv.title, mv.review);
    }


  }
}
