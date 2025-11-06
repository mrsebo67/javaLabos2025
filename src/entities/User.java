package entities;


/**
 * Represents a user in the food delivery system.
 * <p>
 * Each user has identifying and contact information, and an associated address.
 * </p>
 */
public record User(
        int userId,
        String userName,
        String userSurname,
        String userEmail,
        String userPhone,
        entities.Address userAddress
) {
}
