//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Batch155SMSOnline3.Models
{
    using System;
    using System.Collections.Generic;
    
    public partial class Friend
    {
        public int Id { get; set; }
        public Nullable<int> IdUserFriendSend { get; set; }
        public Nullable<int> IdUserFriendReceive { get; set; }
        public Nullable<System.DateTime> TimeFriend { get; set; }
    
        public virtual Customer Customer { get; set; }
        public virtual Customer Customer1 { get; set; }
    }
}
