package de.dhbw.mh.logomach;

public class Bool extends NumericValue {
	
	public final boolean VALUE;
	
	public Bool( boolean value ){
		super( );
		VALUE = value;
	}

	@Override
	public String toString( ){
		return String.format( "%s", VALUE );
	}

}
