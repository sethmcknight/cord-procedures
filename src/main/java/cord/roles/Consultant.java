package cord.roles;
import cord.common.BaseNodeLabels;
import cord.common.RoleNames;
import cord.model.*;

public class Consultant extends BaseRole {
  public Consultant(){
    super(RoleNames.ConsultantRole, Consultant.permission);
  }

  public static IPermission permission = (BaseNodeLabels label, String property) -> {
    switch(label){
      case Budget:                return Consultant.Budget(                 Budget.valueOf(property));
      case BudgetRecord:          return Consultant.BudgetRecord(           BudgetRecord.valueOf(property));
      case Ceremony:              return Consultant.Ceremony(               Ceremony.valueOf(property));
      case Directory:             return Consultant.Directory(              Directory.valueOf(property));
      case Education:             return Consultant.Education(              Education.valueOf(property));
      case EthnologueLanguage:    return Consultant.EthnologueLanguage(     EthnologueLanguage.valueOf(property));
      case FieldRegion:           return Consultant.FieldRegion(            FieldRegion.valueOf(property));
      case FieldZone:             return Consultant.FieldZone(              FieldZone.valueOf(property));
      case File:                  return Consultant.File(                   File.valueOf(property));
      case FileVersion:           return Consultant.FileVersion(            FileVersion.valueOf(property));
      case Film:                  return Consultant.Film(                   Film.valueOf(property));
      case FundingAccount:        return Consultant.FundingAccount(         FundingAccount.valueOf(property));
      case InternshipEngagement:  return Consultant.InternshipEngagement(   InternshipEngagement.valueOf(property));
      case Language:              return Consultant.Language(               Language.valueOf(property));
      case LanguageEngagement:    return Consultant.LanguageEngagement(     LanguageEngagement.valueOf(property));
      case LiteracyMaterial:      return Consultant.LiteracyMaterial(       LiteracyMaterial.valueOf(property));
      case Location:              return Consultant.Location(               Location.valueOf(property));
      case Organization:          return Consultant.Organization(           Organization.valueOf(property));
      case Partner:               return Consultant.Partner(                Partner.valueOf(property));
      case Partnership:           return Consultant.Partnership(            Partnership.valueOf(property));
      case Project:               return Consultant.Project(                Project.valueOf(property));
      case ProjectMember:         return Consultant.ProjectMember(          ProjectMember.valueOf(property));
      case Product:               return Consultant.Product(                Product.valueOf(property));
      case Song:                  return Consultant.Song(                   Song.valueOf(property));
      case Story:                 return Consultant.Story(                  Story.valueOf(property));
      case Unavailability:        return Consultant.Unavailability(         Unavailability.valueOf(property));
      case User:                  return Consultant.User(                   User.valueOf(property));
      default: return Perm.NO;
    }
  };

  private static Perm Budget(Budget property){
    switch(property){
      case universalTemplateFile:      return Perm.NO;
      case records:                    return Perm.NO;
      case status:                     return Perm.NO;
      }
return Perm.NO;
  }

  private static Perm BudgetRecord(BudgetRecord property){
    switch(property){
      case amount:                     return Perm.NO;
      case fiscalYear:                 return Perm.NO;
      case organization:               return Perm.NO;
      }
return Perm.NO;
  }  
  
  private static Perm Ceremony(Ceremony property){
    switch(property){
      case actualDate:                 return Perm.RO;
      case estimatedDate:              return Perm.RO;
      case planned:                    return Perm.RO;
      case type:                       return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Directory(Directory property){
    switch(property){
      case name:                       return Perm.RW;
      case createdBy:                  return Perm.RW;
      case parent:                     return Perm.RW;
      }
return Perm.NO;
  }

  private static Perm Education(Education property){
    switch(property){
      case degree:                     return Perm.NO;
      case institution:                return Perm.NO;
      case major:                      return Perm.NO;
      }
return Perm.NO;
  }

  private static Perm EthnologueLanguage(EthnologueLanguage property){
    switch(property){
      case code:                       return Perm.RO;
      case name:                       return Perm.RO;
      case population:                 return Perm.RO;
      case provisionalCode:            return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm FieldRegion(FieldRegion property){
    switch(property){
      case director:                   return Perm.NO;
      case name:                       return Perm.RO;
      case fieldZone:                  return Perm.RO;
      }
return Perm.NO;
  }  
  
  private static Perm FieldZone(FieldZone property){
    switch(property){
      case director:                   return Perm.NO;
      case name:                       return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm File(File property){
    switch(property){
      case name:                       return Perm.RW;
      case createdBy:                  return Perm.RW;
      case parent:                     return Perm.RW;
      case mimeType:                   return Perm.RW;
      }
return Perm.NO;
  }

  private static Perm FileVersion(FileVersion property){
    switch(property){
      case name:                       return Perm.RW;
      case createdBy:                  return Perm.RW;
      case parent:                     return Perm.RW;
      case mimeType:                   return Perm.RW;
      case size:                       return Perm.RW;
      }
return Perm.NO;
  }

  private static Perm Film(Film property){
    switch(property){
      case name:                       return Perm.RO;
      case scriptureReferences:        return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm FundingAccount(FundingAccount property){
    switch(property){
      case name:                       return Perm.NO;
      case accountNumber:              return Perm.NO;
      }
return Perm.NO;
  }  
  
  private static Perm InternshipEngagement(InternshipEngagement property){
    switch(property){
      case ceremony:                   return Perm.RO;
      case communicationsCompleteDate: return Perm.NO;
      case completeDate:               return Perm.RO;
      case countryOfOrigin:            return Perm.RW;
      case disbursementCompleteDate:   return Perm.NO;
      case endDate:                    return Perm.RO;
      case endDateOverride:            return Perm.RO;
      case growthPlan:                 return Perm.RW;
      case initialEndDate:             return Perm.RO;
      case intern:                     return Perm.RW;
      case lastReactivatedAt:          return Perm.RO;
      case lastSuspendedAt:            return Perm.RO;
      case mentor:                     return Perm.RW;
      case methodologies:              return Perm.RW;
      case position:                   return Perm.RW;
      case startDate:                  return Perm.RO;
      case startDateOverride:          return Perm.RO;
      case statusModifiedAt:           return Perm.RW;
      case modifiedAt:                 return Perm.RW;
      case status:                     return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Language(Language property){
    switch(property){
      case displayName:                return Perm.RO;
      case displayNamePronunciation:   return Perm.RO;
      case isDialect:                  return Perm.RO;
      case isSignLanguage:             return Perm.RO;
      case leastOfThese:               return Perm.RO;
      case name:                       return Perm.RO;
      case leastOfTheseReason:         return Perm.RO;
      case populationOverride:         return Perm.RO;
      case registryOfDialectsCode:     return Perm.RO;
      case signLanguageCode:           return Perm.RO;
      case sponsorEstimatedEndDate:    return Perm.RO;
      case ethnologue:                 return Perm.RO;
      case sensitivity:                return Perm.RO;
      case hasExternalFirstScripture:  return Perm.RO;
      case locations:                  return Perm.RO;
case tags:                             return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm LanguageEngagement(LanguageEngagement pRoperty){
    switch(property){
      case ceremony:                   return Perm.RO;
      case communicationsCompleteDate: return Perm.NO;
      case completeDate:               return Perm.RO;
      case disbursementCompleteDate:   return Perm.NO;
      case endDate:                    return Perm.RO;
      case endDateOverride:            return Perm.RO;
      case firstScripture:             return Perm.RO;
      case initialEndDate:             return Perm.RO;
      case language:                   return Perm.RW;
      case lastReactivatedAt:          return Perm.RO;
      case lastSuspendedAt:            return Perm.RO;
      case lukePartnership:            return Perm.RO;
      case paraTextRegistryId:         return Perm.RW;
      case pnp:                        return Perm.RW;
      case sentPrintingDate:           return Perm.RO;
      case startDate:                  return Perm.RO;
      case startDateOverride:          return Perm.RO;
      case statusModifiedAt:           return Perm.RO;
      case modifiedAt:                 return Perm.RW;
      case product:                    return Perm.RW;
      case status:                     return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm LiteracyMaterial(LiteracyMaterial property){
    switch(property){
      case name:                       return Perm.RO;
      case scriptureReferences:        return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Location(Location property){
    switch(property){
      case name:                       return Perm.RO;
      case type:                       return Perm.RO;
      case sensitivity:                return Perm.RO;
      case isoAlpha3:                  return Perm.RO;
      case fundingAccount:             return Perm.RO;
      }
return Perm.NO;
  }
  
  private static Perm Organization(Organization property){
    switch(property){
      case name:                       return Perm.NO;
      case address:                    return Perm.NO;
      case locations:                  return Perm.NO;
      }
return Perm.NO;
  }

  private static Perm Partner(Partner property){
    switch(property){
      case organization:               return Perm.NO;
      case pointOfContact:             return Perm.NO;
      case types:                      return Perm.NO;
      case financialReportingTypes:    return Perm.NO;
      case pmcEntityCode:              return Perm.NO;
      case globalInnovationsClient:    return Perm.NO;
      case active:                     return Perm.NO;
      case address:                    return Perm.NO;
      case modifiedAt:                 return Perm.NO;
      }
return Perm.NO;
  }

  private static Perm Partnership(Partnership property){
    switch(property){
      case agreement:                  return Perm.RO;
      case agreementStatus:            return Perm.RO;
      case financialReportingType:     return Perm.RO;
      case mou:                        return Perm.RO;
      case mouEnd:                     return Perm.RO;
      case mouEndOverride:             return Perm.RO;
      case mouStart:                   return Perm.RO;
      case mouStartOverride:           return Perm.RO;
      case mouStatus:                  return Perm.RO;
      case types:                      return Perm.RO;
      case organization:               return Perm.RO;
      case partner:                    return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Product(Product property){
    switch(property){
      case mediums:                    return Perm.RO;
      case methodology:                return Perm.RO;
      case purposes:                   return Perm.RO;
      case scriptureReferences:        return Perm.RO;
      case produces:                   return Perm.RO;
      case scriptureReferencesOverride:return Perm.RO;
      case isOverriding:               return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Project(Project property){
    switch(property){
      case estimatedSubmission:        return Perm.RO;
      case step:                       return Perm.RO;
      case name:                       return Perm.RO;
      case status:                     return Perm.RO;
      case departmentId:               return Perm.RO;
      case mouStart:                   return Perm.RO;
      case mouEnd:                     return Perm.RO;
      case rootDirectory:              return Perm.RO;
      case member:                     return Perm.RO;
      case otherLocations:             return Perm.RO;
      case primaryLocation:            return Perm.RO;
      case marketingLocation:          return Perm.RO;
      case partnership:                return Perm.RO;
      case budget:                     return Perm.RO;
      case modifiedAt:                 return Perm.RO;
      case fieldRegion:                return Perm.RO;
      case engagement:                 return Perm.RO;
      case sensitivity:                return Perm.RO;
      case stepChangedAt:              return Perm.RO;
      case owningOrganization:         return Perm.RO;
      case initialMouEnd:              return Perm.RO;
      case tags:                       return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm ProjectMember(ProjectMember property){
    switch(property){
      case roles:                      return Perm.RO;
      case user:                       return Perm.RO;
      case modifiedAt:                 return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Song(Song property){
    switch(property){
      case name:                       return Perm.RO;
      case scriptureReferences:        return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Story(Story property){
    switch(property){
      case name:                       return Perm.RO;
      case scriptureReferences:        return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm Unavailability(Unavailability property){
    switch(property){
      case description:                return Perm.RO;
      case end:                        return Perm.RO;
      case start:                      return Perm.RO;
      }
return Perm.NO;
  }

  private static Perm User(User property){
    switch(property){
      case about:                      return Perm.RO;
      case displayFirstName:           return Perm.RO;
      case displayLastName:            return Perm.RO;
      case email:                      return Perm.RO;
      case phone:                      return Perm.RO;
      case realFirstName:              return Perm.RO;
      case realLastName:               return Perm.RO;
      case roles:                      return Perm.RO;
      case status:                     return Perm.RO;
      case timezone:                   return Perm.RO;
      case title:                      return Perm.RO;
      case education:                  return Perm.RO;
      case organization:               return Perm.RO;
      case unavailability:             return Perm.RO;
      case locations:                  return Perm.RO;
      case partners:                   return Perm.RO;
      }
return Perm.NO;
  }

}
