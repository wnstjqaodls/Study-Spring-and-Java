package com.test;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		
	}
	/*private final List<Map<Integer, String>> list;

	public MyRunnable(List<Map<Integer, String>> list) {
		this.list = list;
	}

	@Override
	public void run() {
		Connection conn = null;
		try {
			conn = getConnection(); // DB 커넥션 연결
			conn.setAutoCommit(false); // 자동 커밋 비활성화
			for (Map<Integer, String> data : list) {
				// 로직 실행
				executeQuery(conn, data); // 쿼리 실행
			}
			conn.commit(); // 커밋
		} catch (SQLException e) {
			try {
				if (conn != null) {
					conn.rollback(); // 롤백
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			close(conn); // 커넥션 종료
		}
	}

	private void executeQuery(Connection conn, Map<Integer, String> data) throws SQLException {
		// 쿼리 실행
	}

	private Connection getConnection() throws SQLException {
		// DB 커넥션 연결
	}

	private void close(Connection conn) {
		// 커넥션 종료
	}*/

}