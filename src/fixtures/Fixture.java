package fixtures;

public abstract class Fixture {

	/*
	 * This abstract class will be used as a base for anything that can be looked at
	 * or interacted with. This class should define (at least) the following
	 * properties:
	 * 
	 * String name : a short name / title for the fixture String shortDescription :
	 * a one-sentence-long description of a fixture, used to briefly mention the
	 * fixture String longDescription : a paragraph-long description of the thing,
	 * displayed when the player investigates the fixture thoroughly (looks at it,
	 * or enters a room) Here's an example of what your game might look like, so
	 * these make sense:
	 */

	private String name;// a short name / title for the fixture
	private String shortDescription; // a one-sentence-long description of a fixture, used to briefly mention the
										// fixture
	private String longDescription; // a paragraph-long description of the thing, displayed when the player
									// investigates the fixture thoroughly (looks at it, or enters a room)

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
