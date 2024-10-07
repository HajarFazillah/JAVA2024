// 예제 03-10 : 2차원 배열 생성 및 활용하기
// 2차원 배열에 학년별로 1,2학기 성적을 저장하고,
// 4년 전체 평점 평균을 출력하라.

package 예제0310;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score [][] = {
				{3.3, 3.4}, // 1학년 1,2학기
				{3.5, 3.6}, // 2학년 1,2학기
				{3.7, 4.0}, // 3학년 1,2학기
				{4.1,4.2}}; // 4학년 1,2학기
		double sum = 0;
		
		// 각 학년별로 반복
		for(int year=0; year<score.length; year++)
			// 각 학년릐 학기별로 반복
			for(int term=0; term<score[year].length; term++)
				sum+=score[year][term]; // 전체 평점 합
		
		int n = score.length;		// 배열의 행 개수, 4
		int m = score[0].length;	// 배열의 열 개수, 2
		
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
	}

}
