package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JDBCMemberRepository implements MemberRepository {

    private DataSource dataSource;

    public JDBCMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Member save(Member member) {

        String sql = String.format
                ("insert into members(name) values('%s')",member.getName());
        Connection conn = null;
        conn = DataSourceUtils.getConnection(dataSource);
        Statement stmt = null;
        ResultSet rs = null;

        try{
            stmt = conn.createStatement();
            stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();

            if(rs.next())
                member.setId(rs.getInt(1));
            else
                System.out.println("ID 조회 실패");

        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            closeConnection(conn,stmt,rs);
        }
        return member;
    }

    public void closeConnection(Connection c, Statement s, ResultSet r)
    {
        try{
            if(r != null)
                r.close();
            if(s != null)
                s.close();
            if(c != null)
                c.close();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Member findById(int id) {

        String sql = String.format
                ("select * from members where id = %d",id);
        Connection conn = null;
        conn = DataSourceUtils.getConnection(dataSource);
        Statement stmt = null;
        ResultSet rs = null;

        try{
            stmt = conn.createStatement();
            rs=  stmt.executeQuery(sql);
            while(rs.next())
            {
                Member m = new Member();
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                return m;
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            closeConnection(conn,stmt,rs);
        }
        return null;
    }

    @Override
    public Member findByName(String name) {
        String sql = String.format
                ("select * from members where name = '%s'",name);
        Connection conn = null;
        conn = DataSourceUtils.getConnection(dataSource);
        Statement stmt = null;
        ResultSet rs = null;

        try{
            stmt = conn.createStatement();
            rs=  stmt.executeQuery(sql);
            while(rs.next())
            {
                Member m = new Member();
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                return m;
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            closeConnection(conn,stmt,rs);
        }
        return null;
    }

    @Override
    public ArrayList<Member> findAll() {

        ArrayList<Member> list = new ArrayList<>();

        String sql = String.format("select * from members;");
        Connection conn = null;
        conn = DataSourceUtils.getConnection(dataSource);
        Statement stmt = null;
        ResultSet rs = null;

        try{
            stmt = conn.createStatement();
            rs=  stmt.executeQuery(sql);
            while(rs.next())
            {
                Member m = new Member();
                m.setId(rs.getInt(1));
                m.setName(rs.getString(2));
                list.add(m);
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            closeConnection(conn,stmt,rs);
        }
        return list;
    }
}
