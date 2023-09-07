package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

	@Autowired // 스프링의 DI 기능으로 questionRepository 객체를 스프링이 자동으로 생성
	// 순환참조 문제와 같은 이유로 @Autowired 보다는 생성자를 통한 객체 주입방식이 권장된다. 
	// 하지만 테스트 코드의 경우에는 생성자를 통한 객체의 주입이 불가능하므로
	// 테스트 코드 작성시에만 @Autowired를 사용하고 실제 코드 작성시에는 
	// 생성자를 통한 객체 주입방식을 사용하겠다.
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionService questionService;
	
//	@Transactional // 메서드가 종료될 때까지 DB 세션이 유지
	@Test
	// JUnit으로 실행시 @Test 애너테이션이 붙은 메서드 실행
	void testJpa() {
//		데이터 저장
//		Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);  // 첫번째 질문 저장
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);  // 두번째 질문 저장
		
//		데이터 조회
//		// findAll() 데이터 조회
//		List<Question> all = this.questionRepository.findAll();
//		// assertEquals(기대값, 실제값) 기대값과 실제값이 같은지 조사
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
//		findById()
//		Optional<Question> oq = this.questionRepository.findById(1);
//		// isPresent() null이 아닌지 확인
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
//		findBySubject()
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
		
//		findBySubjectAndContent()
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());
		
//		findBySubjectLike
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
		
//		데이터 수정
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent()); // 값이 true인지 테스트
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
		
//		데이터 삭제
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());
		
//		답변 데이터 생성 후 저장
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q); // 어떤 질문의 답변인지 알기 위해 Question 객체
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
		
//		답변 조회
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());
		
//		답변에 연결된 질문 찾기, 질문에 달린 답변 찾기
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		List<Answer> answerList = q.getAnswerList();
//		assertEquals(1, answerList.size());
//		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
		
//		for (int i = 1; i <=300; i++) {
//			String subject = String.format("테스트 데이터입니다 :[%03d]", i);
//			String content = "내용무";
//			this.questionService.create(subject, content);
//		}
		
		
		
		
		// 쿼리 생성 규칙 공식 문서 링크
		// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	}

}
