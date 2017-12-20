USE [employee]
GO
/****** Object:  Table [dbo].[表]    Script Date: 12/17/2017 19:37:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[表](
	[id] [nchar](10) NULL,
	[name] [text] NULL,
	[salary] [money] NULL,
	[datelint] [date] NULL,
	[department] [nvarchar](50) NULL,
	[recommend] [nchar](10) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
