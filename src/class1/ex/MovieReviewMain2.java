package class1.ex;

public class MovieReviewMain2 {

  public static void main(String[] args) {

    MoviewReview[] moviewReviews = new MoviewReview[2];

    MoviewReview inception = new MoviewReview();
    inception.title = "인셉션";
    inception.review = "인생은 무한 루프";
    moviewReviews[0] = inception;

    MoviewReview aboutTime = new MoviewReview();
    aboutTime.title = "어바웃타임";
    aboutTime.review = "인생 시간 영화";
    moviewReviews[1] = aboutTime;

    for (int i = 0; i < moviewReviews.length; i++) {
      MoviewReview moviewReview = moviewReviews[i];
      System.out.println("영화 제목: " + moviewReview.title + ", 리뷰: " + moviewReview.review);
    }

  }

}
