// GENERATED BY S3LM4
package selma.mapper;


public final class MapperDtoSelmaGeneratedClass
    implements MapperDto {

  @Override
  public final dtos.OrderDTO map(objects.Order inOrder) {
    dtos.OrderDTO out = null;
    if (inOrder != null) {
      out = new dtos.OrderDTO();
      out.setClient(asClient(inOrder.getClient()));
      out.setCommentOrder(inOrder.getCommentOrder());
      out.setDateOrder(inOrder.getDateOrder());
      out.setIdOrderInternal(inOrder.getIdOrder());
    }
    return out;
  }

  public final objects.Client asClient(objects.Client inClient) {
    objects.Client out = null;
    if (inClient != null) {
      out = new objects.Client();
      out.setEmailClient(inClient.getEmailClient());
      out.setIdClient(inClient.getIdClient());
      out.setNameClient(inClient.getNameClient());
      out.setPhoneClient(inClient.getPhoneClient());
    }
    return out;
  }



  /**
   * Single constructor
   */
  public MapperDtoSelmaGeneratedClass() {
  }

}