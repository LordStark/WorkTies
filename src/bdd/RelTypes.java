package bdd;

import org.neo4j.graphdb.RelationshipType;

public enum RelTypes implements RelationshipType {
	TRAVAILLE_AVEC, ETUDIE_AVEC, A_ETUDIE_AVEC;
}
