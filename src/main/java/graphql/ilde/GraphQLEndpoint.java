package graphql.ilde;
import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

public class GraphQLEndpoint extends SimpleGraphQLServlet {

	private static final long serialVersionUID = -8657920553373606607L;

	public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
    	EmployeeRepository employeeRepository = new EmployeeRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(employeeRepository))
                .build()
                .makeExecutableSchema();
    }
}
