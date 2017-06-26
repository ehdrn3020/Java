public class MariaDB {

	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;

	// MariaDB Connect
	public Connection connect() throws Exception {
		
		// MySQL driver loading
		Class.forName("com.mysql.jdbc.Driver");
		
		// connect URL 144.192.804.206
		connect = DriverManager.getConnection("jdbc:mysql://144.192.804.206:3306/DBNAME?user=UserName&password=123456");
		return connect;
	}


	// fetch table data by Map
	public static HashMap<Integer, HashMap<String, String>> getEdateOriginalData(Connection connect, String dataTableName, String edate) throws Exception {

		HashMap<Integer, HashMap<String, String>> tabledata = new HashMap<Integer, HashMap<String, String>>();
		List<String> columnList = getColumnList(connect, dataTableName);

		Integer columnSize = columnList.size(); //column size
		preparedStatement = connect.prepareStatement("SELECT * FROM " + dataTableName + " WHERE EDATE='" + edate + "'");
		resultSet = preparedStatement.executeQuery();

		int recordCnt = 0;

		while (resultSet.next()) {
			recordCnt++;
			HashMap<String, String> record = new HashMap<String, String>();
			for (int i = 0; i < columnSize; i++) {
				record.put(columnList.get(i), resultSet.getString(i + 1));
			}
			tabledata.put(recordCnt, record);
		}
		return tabledata;
	}

	// Insert Data
	public static String insertCptExpMngBsc(Connection connect, String division, String object, String subject, String how, String amount, String sum) throws Exception {
		try {
			preparedStatement = connect.prepareStatement("INSERT INTO CPT_DB (DIVISION, OBJECT, SUBJECT, HOW, AMOUNT, SUM) VALUES (?, ?, ?, ?, ?, ?)");

			// parameter start 1
			preparedStatement.setString(1, division);
			preparedStatement.setString(2, object);
			preparedStatement.setString(3, subject);
			preparedStatement.setString(4, how);
			preparedStatement.setString(5, amount);
			preparedStatement.setString(6, sum);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {

		}
		return "Insert to MariaDB Success.";
	}

}